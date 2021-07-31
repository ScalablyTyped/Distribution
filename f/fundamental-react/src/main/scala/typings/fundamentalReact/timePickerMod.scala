package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.MeridiemPM
import typings.fundamentalReact.timeMod.TimeBaseProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerMod {
  
  @JSImport("fundamental-react/lib/TimePicker/TimePicker", JSImport.Default)
  @js.native
  class default ()
    extends Component[TimePickerProps, js.Object, js.Any]
  object default {
    
    @JSImport("fundamental-react/lib/TimePicker/TimePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/TimePicker/TimePicker", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.TimePicker = js.native
    @scala.inline
    def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.TimePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type TimePicker = Component[TimePickerProps, js.Object, js.Any]
  
  trait TimePickerProps
    extends StObject
       with TimeBaseProps
       with /* x */ StringDictionary[js.Any] {
    
    var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var localizedText: js.UndefOr[MeridiemPM] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var timeProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TimePickerProps {
    
    @scala.inline
    def apply(): TimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerProps]
    }
    
    @scala.inline
    implicit class TimePickerPropsMutableBuilder[Self <: TimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setLocalizedText(value: MeridiemPM): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setTimeProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "timeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePropsUndefined: Self = StObject.set(x, "timeProps", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
