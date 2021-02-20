package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Hour
import typings.fundamentalReact.anon.MeridiemPM
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* Inlined {  buttonProps :{[x: string] : any} | undefined,   disabled :boolean | undefined,   id :string | undefined,   inputProps :{[x: string] : any} | undefined,   localizedText :{  meridiemAM :string,   meridiemPM :string} | undefined,   popoverProps :{[x: string] : any} | undefined,   timeProps :{[x: string] : any} | undefined,   value :string | undefined,   onChange :(args : ...any): any | undefined, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
  @js.native
  trait TimePickerProps
    extends /* x */ StringDictionary[js.Any] {
    
    var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var format12Hours: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var localizedText: js.UndefOr[MeridiemPM] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var spinners: js.UndefOr[Boolean] = js.native
    
    var time: js.UndefOr[Hour] = js.native
    
    var timeProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var value: js.UndefOr[String] = js.native
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
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormat12Hours(value: Boolean): Self = StObject.set(x, "format12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat12HoursUndefined: Self = StObject.set(x, "format12Hours", js.undefined)
      
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
      def setOnChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setSpinners(value: Boolean): Self = StObject.set(x, "spinners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnersUndefined: Self = StObject.set(x, "spinners", js.undefined)
      
      @scala.inline
      def setTime(value: Hour): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "timeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePropsUndefined: Self = StObject.set(x, "timeProps", js.undefined)
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
