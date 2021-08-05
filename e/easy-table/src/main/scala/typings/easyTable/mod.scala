package typings.easyTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-table", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with EasyTable
  @JSImport("easy-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Predefined helpers for totals
    */
  /* static member */
  @JSImport("easy-table", "aggr")
  @js.native
  def aggr: Aggregators = js.native
  inline def aggr_=(x: Aggregators): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aggr")(x.asInstanceOf[js.Any])
  
  /**
    * Create a printer which right aligns the content by padding with `ch` on the left
    *
    * @param {String} ch
    * @returns {Function}
    */
  /* static member */
  inline def leftPadder[T](ch: String): CellPrinter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPadder")(ch.asInstanceOf[js.Any]).asInstanceOf[CellPrinter[T]]
  
  /**
    * Same as `Table.print()` but yields the result to `console.log()`
    */
  /* static member */
  inline def log[T](obj: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def log[T](obj: T, format: Unit, cb: TablePostProcessing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: T, format: FormatFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: T, format: FormatObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: T, format: FormatObject, cb: TablePostProcessing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def log[T](obj: js.Array[T], format: Unit, cb: TablePostProcessing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: js.Array[T], format: FormatFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: js.Array[T], format: FormatObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // public static padRight: CellPrinter<string>;
  /**
    * Create a printer for numbers
    *
    * Will do right alignment and optionally fix the number of digits after decimal point
    *
    * @param {Number} [digits] - Number of digits for fixpoint notation
    * @returns {Function}
    */
  /* static member */
  inline def number(): CellPrinter[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[CellPrinter[Double]]
  inline def number(digits: Double): CellPrinter[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(digits.asInstanceOf[js.Any]).asInstanceOf[CellPrinter[Double]]
  
  /* static member */
  @JSImport("easy-table", "padLeft")
  @js.native
  def padLeft: CellPrinter[String] = js.native
  inline def padLeft_=(x: CellPrinter[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padLeft")(x.asInstanceOf[js.Any])
  
  /**
    * Print the array or object
    *
    * @param {Array|Object} obj - Object to print
    * @param {Function|Object} [format] - Format options
    * @param {Function} [cb] - Table post processing and formating
    * @returns {String}
    */
  /* static member */
  inline def print[T](obj: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def print[T](obj: T, format: Unit, cb: TablePostProcessing): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: T, format: FormatFunction[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: T, format: FormatObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: T, format: FormatObject, cb: TablePostProcessing): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def print[T](obj: js.Array[T], format: Unit, cb: TablePostProcessing): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: js.Array[T], format: FormatFunction[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: js.Array[T], format: FormatObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def print[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): String = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(obj.asInstanceOf[js.Any], format.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Create a printer which pads with `ch` on the right
    *
    * @param {String} ch
    * @returns {Function}
    */
  /* static member */
  inline def rightPadder[T](ch: String): CellPrinter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightPadder")(ch.asInstanceOf[js.Any]).asInstanceOf[CellPrinter[T]]
  
  /**
    * Default printer
    */
  /* static member */
  inline def string(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Aggregators extends StObject {
    
    /**
      * Average reduction
      */
    var avg: js.Any
    
    /**
      * Create a printer which formats the value with `printer`,
      * adds the `prefix` to it and right aligns the whole thing
      *
      * @param {String} prefix
      * @param {Function} printer
      * @returns {printer}
      */
    def printer[T](prefix: String, printer: CellPrinter[T]): CellPrinter[T]
    
    /**
      * Sum reduction
      */
    var sum: js.Any
  }
  object Aggregators {
    
    inline def apply(avg: js.Any, printer: (String, CellPrinter[js.Any]) => CellPrinter[js.Any], sum: js.Any): Aggregators = {
      val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], printer = js.Any.fromFunction2(printer), sum = sum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aggregators]
    }
    
    extension [Self <: Aggregators](x: Self) {
      
      inline def setAvg(value: js.Any): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      inline def setPrinter(value: (String, CellPrinter[js.Any]) => CellPrinter[js.Any]): Self = StObject.set(x, "printer", js.Any.fromFunction2(value))
      
      inline def setSum(value: js.Any): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    }
  }
  
  type CellPrinter[T] = js.Function2[/* val */ T, /* width */ Double, String]
  
  trait ColumnFormat[T] extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var printer: js.UndefOr[CellPrinter[T]] = js.undefined
  }
  object ColumnFormat {
    
    inline def apply[T](): ColumnFormat[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnFormat[T]]
    }
    
    extension [Self <: ColumnFormat[?], T](x: Self & ColumnFormat[T]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrinter(value: (T, /* width */ Double) => String): Self = StObject.set(x, "printer", js.Any.fromFunction2(value))
      
      inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
    }
  }
  
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  @js.native
  trait EasyTable extends StObject {
    
    /**
      * Write cell in the current row
      *
      * @param {String} col          - Column name
      * @param {Any} val             - Cell value
      * @param {Function} [printer]  - Printer function to format the value
      * @returns {Table} `this`
      */
    def cell[T](col: String, `val`: T): this.type = js.native
    def cell[T](col: String, `val`: T, printer: CellPrinter[T]): this.type = js.native
    
    /**
      * Get list of columns in printing order
      *
      * @returns {string[]}
      */
    def columns(): js.Array[String] = js.native
    
    /**
      * Compute all totals and yield the results to `cb`
      *
      * @param {Function} cb - Callback function with signature `(column, value, printer)`
      */
    def forEachTotal[T](cb: js.Function3[/* column */ String, /* value */ T, /* printer */ CellPrinter[T], Unit]): Unit = js.native
    
    /**
      * Same as `.toString()` but yields the result to `console.log()`
      */
    def log(): Unit = js.native
    
    /**
      * Push the current row to the table and start a new one
      *
      * @returns {Table} `this`
      */
    def newRow(): this.type = js.native
    
    /**
      * Format just rows, i.e. print the table without headers and totals
      *
      * @returns {String} String representaion of the table
      */
    def print(): String = js.native
    
    /**
      * Format the table so that each row represents column and each column represents row
      *
      * @param {IPrintColumnOptions} [opts]
      * @returns {String}
      */
    def printTransposed[T](): String = js.native
    def printTransposed[T](opts: PrintColumnOptions[T]): String = js.native
    
    /**
      * Push delimeter row to the table (with each cell filled with dashs during printing)
      *
      * @param {String[]} [cols]
      * @returns {Table} `this`
      */
    def pushDelimeter(): this.type = js.native
    def pushDelimeter(cols: js.Array[String]): this.type = js.native
    
    /**
      * String to separate columns
      */
    var separator: String = js.native
    
    /**
      * Sort the table
      *
      * @param {Function|string[]} [cmp] - Either compare function or a list of columns to sort on
      * @returns {Table} `this`
      */
    def sort(): this.type = js.native
    def sort(cmp: js.Array[String]): this.type = js.native
    def sort[T](cmp: CompareFunction[T]): this.type = js.native
    /**
      * Sort the table
      *
      * @param {Function|string[]} [cmp] - Either compare function or a list of columns to sort on
      * @returns {Table} `this`
      */
    @JSName("sort")
    def sort_T[T](): this.type = js.native
    
    /**
      * Add a total for the column
      *
      * @param {String} col - column name
      * @param {Object} [opts]
      * @returns {Table} `this`
      */
    def total[T](col: String): this.type = js.native
    def total[T](col: String, opts: TotalOptions[T]): this.type = js.native
  }
  
  type FormatFunction[T] = js.Function2[
    /* obj */ T, 
    /* cell */ js.Function2[/* name */ String, /* val */ js.Any, Unit], 
    Unit
  ]
  
  type FormatObject = StringDictionary[ColumnFormat[js.Any]]
  
  trait PrintColumnOptions[T] extends StObject {
    
    /**
      * Printer to format column names
      */
    var namePrinter: js.UndefOr[CellPrinter[T]] = js.undefined
    
    /**
      * Column separation string
      */
    var separator: js.UndefOr[String] = js.undefined
  }
  object PrintColumnOptions {
    
    inline def apply[T](): PrintColumnOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintColumnOptions[T]]
    }
    
    extension [Self <: PrintColumnOptions[?], T](x: Self & PrintColumnOptions[T]) {
      
      inline def setNamePrinter(value: (T, /* width */ Double) => String): Self = StObject.set(x, "namePrinter", js.Any.fromFunction2(value))
      
      inline def setNamePrinterUndefined: Self = StObject.set(x, "namePrinter", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type ReduceFunction[T] = js.Function4[/* acc */ T, /* val */ T, /* idx */ Double, /* length */ Double, T]
  
  type TablePostProcessing = js.Function1[/* result */ EasyTable, String]
  
  trait TotalOptions[T] extends StObject {
    
    /**
      * Initial value for reduction
      */
    var init: js.UndefOr[T] = js.undefined
    
    /**
      * Printer to format the total cell
      */
    var printer: js.UndefOr[CellPrinter[T]] = js.undefined
    
    /**
      * reduce(acc, val, idx, length) function to compute the total value
      */
    var reduce: js.UndefOr[ReduceFunction[T]] = js.undefined
  }
  object TotalOptions {
    
    inline def apply[T](): TotalOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TotalOptions[T]]
    }
    
    extension [Self <: TotalOptions[?], T](x: Self & TotalOptions[T]) {
      
      inline def setInit(value: T): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setPrinter(value: (T, /* width */ Double) => String): Self = StObject.set(x, "printer", js.Any.fromFunction2(value))
      
      inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
      
      inline def setReduce(value: (T, T, /* idx */ Double, /* length */ Double) => T): Self = StObject.set(x, "reduce", js.Any.fromFunction4(value))
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    }
  }
}
