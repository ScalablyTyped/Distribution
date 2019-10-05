package typings.dojo.dojox.grid.enhanced.plugins.filter

import typings.dojo.Fn_ColArg
import typings.dojo.Fn_ColIdx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.html
  *
  *
  */
trait _DataExprs extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit
  /**
    *
    */
  def DateExpr(): Unit
  /**
    *
    */
  def NumberExpr(): Unit
  /**
    *
    */
  def StringExpr(): Unit
  /**
    *
    */
  def TimeExpr(): Unit
}

@JSGlobal("dojox.grid.enhanced.plugins.filter._DataExprs")
@js.native
object _DataExprs extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.BooleanExpr.html
    *
    * A condition expression wrapper for boolean values
    *
    * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
    * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
    * @param convertArgs
    */
  @js.native
  class BooleanExpr () extends js.Object {
    def this(dataValue: js.Any) = this()
    def this(dataValue: js.Any, isColumn: Boolean) = this()
    def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
    /**
      * Implement _ConditionExpr.applyRow.
      * If this is a pure value, simply return self.
      * Otherwise, extract the cell data from datarow using the given getter function,
      * and then convert this cell data to a _DataExpr and return the expression.
      * An object with the following properties:_nameapplyRow: Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      * toObject: Convert this data expression to a simple object. Mainly used for serialization.
      * getName: Get the name of this kind of expression.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * If this is a pure value wrapper, simply return the value.
      * Otherwise (it's a column), return is undefined.
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.DateExpr.html
    *
    * A condition expression wrapper for date values
    *
    * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
    * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
    * @param convertArgs
    */
  @js.native
  class DateExpr () extends js.Object {
    def this(dataValue: js.Any) = this()
    def this(dataValue: js.Any, isColumn: Boolean) = this()
    def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
    /**
      * Implement _ConditionExpr.applyRow.
      * If this is a pure value, simply return self.
      * Otherwise, extract the cell data from datarow using the given getter function,
      * and then convert this cell data to a _DataExpr and return the expression.
      * An object with the following properties:_nameapplyRow: Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      * toObject: Convert this data expression to a simple object. Mainly used for serialization.
      * getName: Get the name of this kind of expression.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * If this is a pure value wrapper, simply return the value.
      * Otherwise (it's a column), return is undefined.
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Overrided from _DataExpr.toObject
      *
      */
    def toObject(): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.NumberExpr.html
    *
    * A condition expression wrapper for number values
    *
    * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
    * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
    * @param convertArgs
    */
  @js.native
  class NumberExpr () extends js.Object {
    def this(dataValue: js.Any) = this()
    def this(dataValue: js.Any, isColumn: Boolean) = this()
    def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
    /**
      * Implement _ConditionExpr.applyRow.
      * If this is a pure value, simply return self.
      * Otherwise, extract the cell data from datarow using the given getter function,
      * and then convert this cell data to a _DataExpr and return the expression.
      * An object with the following properties:_nameapplyRow: Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      * toObject: Convert this data expression to a simple object. Mainly used for serialization.
      * getName: Get the name of this kind of expression.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * If this is a pure value wrapper, simply return the value.
      * Otherwise (it's a column), return is undefined.
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.StringExpr.html
    *
    * A condition expression wrapper for string values
    *
    * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
    * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
    * @param convertArgs
    */
  @js.native
  class StringExpr () extends js.Object {
    def this(dataValue: js.Any) = this()
    def this(dataValue: js.Any, isColumn: Boolean) = this()
    def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
    /**
      * Implement _ConditionExpr.applyRow.
      * If this is a pure value, simply return self.
      * Otherwise, extract the cell data from datarow using the given getter function,
      * and then convert this cell data to a _DataExpr and return the expression.
      * An object with the following properties:_nameapplyRow: Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      * toObject: Convert this data expression to a simple object. Mainly used for serialization.
      * getName: Get the name of this kind of expression.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * If this is a pure value wrapper, simply return the value.
      * Otherwise (it's a column), return is undefined.
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.TimeExpr.html
    *
    * A condition expression wrapper for time values
    *
    * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
    * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
    * @param convertArgs
    */
  @js.native
  class TimeExpr () extends js.Object {
    def this(dataValue: js.Any) = this()
    def this(dataValue: js.Any, isColumn: Boolean) = this()
    def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
    /**
      * Implement _ConditionExpr.applyRow.
      * If this is a pure value, simply return self.
      * Otherwise, extract the cell data from datarow using the given getter function,
      * and then convert this cell data to a _DataExpr and return the expression.
      * An object with the following properties:_nameapplyRow: Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      * toObject: Convert this data expression to a simple object. Mainly used for serialization.
      * getName: Get the name of this kind of expression.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * If this is a pure value wrapper, simply return the value.
      * Otherwise (it's a column), return is undefined.
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Overrided from _DataExpr.toObject
      *
      */
    def toObject(): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs._BiOpExpr.html
    *
    * The most abstract class for all bi-operator expressions.
    * A bi-operator expression is an _OperatorExpr that allow and only allow two operands.
    *
    */
  @js.native
  class _BiOpExpr () extends js.Object {
    /**
      * Implement _ConditionExpr.applyRow.
      * Apply the restriction of "two operands" and confirm operands are valid _ConditionExpr's.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColArg): js.Any = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): js.Object = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs._ConditionExpr.html
    *
    * The most abstract class for all condition expressions.
    * A condition expression can be applied on a data row (e.g. an item in a store)
    * and generate a result condition expression.
    *
    */
  @js.native
  class _ConditionExpr () extends js.Object {
    /**
      * Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      *
      * @param datarow A data item of a store.
      * @param getter A user defined function that extract cell data from datarow.colArg is an argument that provides a kind of column information.It is defined by user in the constructor of a _DataExpr object.
      */
    def applyRow(datarow: js.Object, getter: Fn_ColArg): js.Any = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * Convert this data expression to a simple object. Mainly used for serialization.
      *
      */
    def toObject(): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs._DataExpr.html
    *
    * The most abstract class for all data expressions.
    * A _DataExpr is a condition expression for a single data value.
    * If the data value to be represent is a pure value (literal value, like string/number/Date/...)
    * this _DataExpr is nothing more than a simple wrapper.
    * If the data value to be represent is in a store, then _DataExpr is responsible to extract it
    * from the store when this condition is applied to a data row.
    *
    * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
    * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
    * @param convertArgs
    */
  @js.native
  class _DataExpr () extends js.Object {
    def this(dataValue: js.Any) = this()
    def this(dataValue: js.Any, isColumn: Boolean) = this()
    def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
    /**
      * Implement _ConditionExpr.applyRow.
      * If this is a pure value, simply return self.
      * Otherwise, extract the cell data from datarow using the given getter function,
      * and then convert this cell data to a _DataExpr and return the expression.
      * An object with the following properties:_nameapplyRow: Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      * toObject: Convert this data expression to a simple object. Mainly used for serialization.
      * getName: Get the name of this kind of expression.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * If this is a pure value wrapper, simply return the value.
      * Otherwise (it's a column), return is undefined.
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs._OperatorExpr.html
    *
    * The most abstract class for all operator expressions.
    * An operator expression is a _ConditionExpr that represents an operation.
    *
    */
  @js.native
  class _OperatorExpr () extends js.Object {
    /**
      * Unimplemented Interface
      * Apply this condition expression on the given datarow, return a result expression.
      *
      * @param datarow A data item of a store.
      * @param getter A user defined function that extract cell data from datarow.colArg is an argument that provides a kind of column information.It is defined by user in the constructor of a _DataExpr object.
      */
    def applyRow(datarow: js.Object, getter: Fn_ColArg): js.Any = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): js.Object = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs._UniOpExpr.html
    *
    * The most abstract class for all uni-operator expressions.
    * A uni-operator expression is an _OperatorExpr that only allow one operand.
    *
    */
  @js.native
  class _UniOpExpr () extends js.Object {
    /**
      * Implement _ConditionExpr.applyRow.
      * Apply the restriction of "only one operand" and confirm the operand is a valid _ConditionExpr.
      * Then do the calculation of this operator.
      *
      * @param datarow
      * @param getter
      */
    def applyRow(datarow: js.Object, getter: Fn_ColArg): js.Any = js.native
    /**
      * Get the name of this kind of expression.
      *
      */
    def getName(): js.Any = js.native
    /**
      * Overrided from _ConditionExpr.toObject
      *
      */
    def toObject(): js.Object = js.native
  }
  
}

