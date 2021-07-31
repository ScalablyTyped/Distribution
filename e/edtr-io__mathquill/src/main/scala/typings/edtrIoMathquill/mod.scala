package typings.edtrIoMathquill

import typings.edtrIoMathquill.anon.Edit
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Config extends StObject {
    
    var autoCommands: js.UndefOr[String] = js.undefined
    
    var autoOperatorNames: js.UndefOr[String] = js.undefined
    
    var autoSubscriptNumerals: js.UndefOr[Boolean] = js.undefined
    
    var charsThatBreakOutOfSupSub: js.UndefOr[String] = js.undefined
    
    var handlers: js.UndefOr[Edit] = js.undefined
    
    var leftRightIntoCmdGoes: js.UndefOr[String] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var restrictMismatchedBrackets: js.UndefOr[Boolean] = js.undefined
    
    var spaceBehavesLikeTab: js.UndefOr[Boolean] = js.undefined
    
    var substituteTextarea: js.UndefOr[js.Function0[HTMLTextAreaElement]] = js.undefined
    
    var sumStartsWithNEquals: js.UndefOr[Boolean] = js.undefined
    
    var supSubsRequireOperand: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCommands(value: String): Self = StObject.set(x, "autoCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCommandsUndefined: Self = StObject.set(x, "autoCommands", js.undefined)
      
      @scala.inline
      def setAutoOperatorNames(value: String): Self = StObject.set(x, "autoOperatorNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoOperatorNamesUndefined: Self = StObject.set(x, "autoOperatorNames", js.undefined)
      
      @scala.inline
      def setAutoSubscriptNumerals(value: Boolean): Self = StObject.set(x, "autoSubscriptNumerals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSubscriptNumeralsUndefined: Self = StObject.set(x, "autoSubscriptNumerals", js.undefined)
      
      @scala.inline
      def setCharsThatBreakOutOfSupSub(value: String): Self = StObject.set(x, "charsThatBreakOutOfSupSub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsThatBreakOutOfSupSubUndefined: Self = StObject.set(x, "charsThatBreakOutOfSupSub", js.undefined)
      
      @scala.inline
      def setHandlers(value: Edit): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setLeftRightIntoCmdGoes(value: String): Self = StObject.set(x, "leftRightIntoCmdGoes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftRightIntoCmdGoesUndefined: Self = StObject.set(x, "leftRightIntoCmdGoes", js.undefined)
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setRestrictMismatchedBrackets(value: Boolean): Self = StObject.set(x, "restrictMismatchedBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictMismatchedBracketsUndefined: Self = StObject.set(x, "restrictMismatchedBrackets", js.undefined)
      
      @scala.inline
      def setSpaceBehavesLikeTab(value: Boolean): Self = StObject.set(x, "spaceBehavesLikeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceBehavesLikeTabUndefined: Self = StObject.set(x, "spaceBehavesLikeTab", js.undefined)
      
      @scala.inline
      def setSubstituteTextarea(value: () => HTMLTextAreaElement): Self = StObject.set(x, "substituteTextarea", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubstituteTextareaUndefined: Self = StObject.set(x, "substituteTextarea", js.undefined)
      
      @scala.inline
      def setSumStartsWithNEquals(value: Boolean): Self = StObject.set(x, "sumStartsWithNEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSumStartsWithNEqualsUndefined: Self = StObject.set(x, "sumStartsWithNEquals", js.undefined)
      
      @scala.inline
      def setSupSubsRequireOperand(value: Boolean): Self = StObject.set(x, "supSubsRequireOperand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupSubsRequireOperandUndefined: Self = StObject.set(x, "supSubsRequireOperand", js.undefined)
    }
  }
  
  @js.native
  trait MQ
    extends StObject
       with MathField {
    
    var L: Double = js.native
    
    var R: Double = js.native
    
    def el(): HTMLElement = js.native
    
    def latex(): String = js.native
    def latex(latex: String): MQ = js.native
    
    def reflow(): MQ = js.native
    
    def revert(): MQ = js.native
  }
  
  trait MathField extends StObject {
    
    def blur(): MQ
    
    def clearSelection(): MQ
    
    def cmd(latex: String): MQ
    
    def config(config: Config): MQ
    
    def focus(): MQ
    
    def keystroke(keys: String): MQ
    
    def moveToDirEnd(direction: Double): MQ
    
    def moveToLeftEnd(): MQ
    
    def moveToRightEnd(): MQ
    
    def select(): MQ
    
    def typedText(text: String): MQ
    
    def write(latex: String): MQ
  }
  object MathField {
    
    @scala.inline
    def apply(
      blur: () => MQ,
      clearSelection: () => MQ,
      cmd: String => MQ,
      config: Config => MQ,
      focus: () => MQ,
      keystroke: String => MQ,
      moveToDirEnd: Double => MQ,
      moveToLeftEnd: () => MQ,
      moveToRightEnd: () => MQ,
      select: () => MQ,
      typedText: String => MQ,
      write: String => MQ
    ): MathField = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), clearSelection = js.Any.fromFunction0(clearSelection), cmd = js.Any.fromFunction1(cmd), config = js.Any.fromFunction1(config), focus = js.Any.fromFunction0(focus), keystroke = js.Any.fromFunction1(keystroke), moveToDirEnd = js.Any.fromFunction1(moveToDirEnd), moveToLeftEnd = js.Any.fromFunction0(moveToLeftEnd), moveToRightEnd = js.Any.fromFunction0(moveToRightEnd), select = js.Any.fromFunction0(select), typedText = js.Any.fromFunction1(typedText), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[MathField]
    }
    
    @scala.inline
    implicit class MathFieldMutableBuilder[Self <: MathField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => MQ): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearSelection(value: () => MQ): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCmd(value: String => MQ): Self = StObject.set(x, "cmd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfig(value: Config => MQ): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocus(value: () => MQ): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeystroke(value: String => MQ): Self = StObject.set(x, "keystroke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToDirEnd(value: Double => MQ): Self = StObject.set(x, "moveToDirEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToLeftEnd(value: () => MQ): Self = StObject.set(x, "moveToLeftEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoveToRightEnd(value: () => MQ): Self = StObject.set(x, "moveToRightEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelect(value: () => MQ): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypedText(value: String => MQ): Self = StObject.set(x, "typedText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: String => MQ): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
