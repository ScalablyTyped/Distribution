package typings.dockerfileAst

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  @js.native
  class Variable protected () extends js.Object {
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Null,
      substitutionParameter: String,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Null,
      substitutionParameter: String,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Null,
      substitutionParameter: Null,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Null,
      substitutionParameter: Null,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Range,
      substitutionParameter: String,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Range,
      substitutionParameter: String,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Range,
      substitutionParameter: Null,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: String,
      modifierRange: Range,
      substitutionParameter: Null,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Null,
      substitutionParameter: String,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Null,
      substitutionParameter: String,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Null,
      substitutionParameter: Null,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Null,
      substitutionParameter: Null,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Range,
      substitutionParameter: String,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Range,
      substitutionParameter: String,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Range,
      substitutionParameter: Null,
      substitutionRange: Null,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    def this(
      name: String,
      nameRange: Range,
      range: Range,
      modifier: Null,
      modifierRange: Range,
      substitutionParameter: Null,
      substitutionRange: Range,
      defined: Boolean,
      buildVariable: Boolean,
      stringValue: String
    ) = this()
    val buildVariable: js.Any = js.native
    val defined: js.Any = js.native
    val modifier: js.Any = js.native
    val modifierRange: js.Any = js.native
    val name: js.Any = js.native
    val nameRange: js.Any = js.native
    val range: js.Any = js.native
    val stringValue: js.Any = js.native
    val substitutionParameter: js.Any = js.native
    val substitutionRange: js.Any = js.native
    /**
      * Returns the modifier character that has been set for
      * specifying how this variable should be expanded and resolved.
      * If this variable is ${variable:+value} then the modifier
      * character is '+'. Will be the empty string if the variable is
      * declared as ${variable:}. Otherwise, will be null if this
      * variable will not use variable substitution at all (such as
      * ${variable} or $variable).
      *
      * @return this variable's modifier character, or the empty
      *         string if it does not have one, or null if this
      *         variable will not use variable substitution
      */
    def getModifier(): String | Null = js.native
    def getModifierRange(): Range | Null = js.native
    def getName(): String = js.native
    def getNameRange(): Range = js.native
    /**
      * Returns the range of the entire variable. This includes the symbols for
      * the declaration of the variable such as the $, {, and } symbols.
      *
      * @return the range in the document that this variable encompasses in its
      *         entirety
      */
    def getRange(): Range = js.native
    /**
      * Returns the parameter that will be used for substitution if
      * this variable uses modifiers to define how its value should be
      * resolved. If this variable is ${variable:+value} then the
      * substitution value will be 'value'. Will be the empty string
      * if the variable is declared as ${variable:+} or some other
      * variant where the only thing that follows the modifier
      * character (excluding considerations of escape characters and
      * so on) is the variable's closing bracket. May be null if this
      * variable does not have a modifier character defined (such as
      * ${variable} or $variable).
      *
      * @return this variable's substitution parameter, or the empty
      *         string if it does not have one, or null if there is
      *         not one defined
      */
    def getSubstitutionParameter(): String | Null = js.native
    def getSubstitutionRange(): Range | Null = js.native
    def isBuildVariable(): Boolean = js.native
    /**
      * Returns whether this variable has been defined or not.
      *
      * @return true if this variable has been defined, false otherwise
      */
    def isDefined(): Boolean = js.native
    def isEnvironmentVariable(): Boolean = js.native
  }
  
}

