package typings.dockerfileAst

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/flag", JSImport.Namespace)
@js.native
object flagMod extends js.Object {
  @js.native
  class Flag protected () extends js.Object {
    def this(range: Range, name: String, nameRange: Range) = this()
    def this(range: Range, name: String, nameRange: Range, value: String) = this()
    def this(range: Range, name: String, nameRange: Range, value: String, valueRange: Range) = this()
    def this(range: Range, name: String, nameRange: Range, value: Null, valueRange: Range) = this()
    val name: js.Any = js.native
    val nameRange: js.Any = js.native
    val range: js.Any = js.native
    val value: js.Any = js.native
    val valueRange: js.Any = js.native
    /**
      * Returns the name of this flag. The name does not include the -- prefix.
      * Thus, for HEALTHCHECK's --interval flag, interval is the flag's name and
      * not --interval.
      *
      * @return this flag's name
      */
    def getName(): String = js.native
    /**
      * Returns the range that encompasses the flag's name
      *
      * @return the range containing the flag's name
      */
    def getNameRange(): Range = js.native
    /**
      * Returns the range that encompasses this entire flag. This includes the
      * -- prefix in the beginning to the last character of the flag's value (if
      * it has been defined).
      *
      * @return the entire range of this flag
      */
    def getRange(): Range = js.native
    /**
      * Returns the value that has been set to this flag. May be null if the
      * flag is invalid and has no value set like a --start-period. If the flag
      * is instead a --start-period= with an equals sign then the flag's value
      * is the empty string.
      *
      * @return this flag's value if it has been defined, null otherwise
      */
    def getValue(): String | Null = js.native
    /**
      * Returns the range that encompasses this flag's value. If no value has
      * been set then null will be returned.
      *
      * @return the range containing this flag's value, or null if the flag
      *         has no value defined
      */
    def getValueRange(): Range | Null = js.native
  }
  
}

