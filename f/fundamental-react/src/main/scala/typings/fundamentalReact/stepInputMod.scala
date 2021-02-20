package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialStepInputProps
import typings.fundamentalReact.anon.State
import typings.fundamentalReact.anon.WeakValidationMapStepInpu
import typings.fundamentalReact.fundamentalReactStrings.StepInput
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepInputMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> & {  displayName :'StepInput'} */
  object default {
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[StepInputProps]): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/StepInput/StepInput", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[StepInputProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/StepInput/StepInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialStepInputProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialStepInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.displayName")
    @js.native
    def displayName: js.UndefOr[StepInput | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[StepInput | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapStepInpu] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapStepInpu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StepInputProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var localizedText: js.UndefOr[js.Any] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var validationState: js.UndefOr[State] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object StepInputProps {
    
    @scala.inline
    def apply(): StepInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepInputProps]
    }
    
    @scala.inline
    implicit class StepInputPropsMutableBuilder[Self <: StepInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLocalizedText(value: js.Any): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
