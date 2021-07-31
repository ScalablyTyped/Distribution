package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Hour
import typings.fundamentalReact.anon.MeridiemAM
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  @JSImport("fundamental-react/lib/Time/Time", JSImport.Default)
  @js.native
  class default ()
    extends Component[TimeProps, js.Object, js.Any]
  object default {
    
    @JSImport("fundamental-react/lib/Time/Time", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/Time/Time", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.Time = js.native
    @scala.inline
    def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.Time): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Time = Component[TimeProps, js.Object, js.Any]
  
  trait TimeBaseProps extends StObject {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var format12Hours: js.UndefOr[Boolean] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var spinners: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Hour] = js.undefined
  }
  object TimeBaseProps {
    
    @scala.inline
    def apply(): TimeBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeBaseProps]
    }
    
    @scala.inline
    implicit class TimeBasePropsMutableBuilder[Self <: TimeBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setFormat12Hours(value: Boolean): Self = StObject.set(x, "format12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat12HoursUndefined: Self = StObject.set(x, "format12Hours", js.undefined)
      
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
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait TimeProps
    extends StObject
       with TimeBaseProps
       with /* x */ StringDictionary[js.Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoursDownButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var hoursInputProps: js.UndefOr[js.Any] = js.undefined
    
    var hoursUpButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var localizedText: js.UndefOr[MeridiemAM] = js.undefined
    
    var meridiemDownButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var meridiemInputProps: js.UndefOr[js.Any] = js.undefined
    
    var meridiemUpButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var minutesDownButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var minutesInputProps: js.UndefOr[js.Any] = js.undefined
    
    var minutesUpButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* time */ Hour, Unit]] = js.undefined
    
    var secondsDownButtonProps: js.UndefOr[js.Any] = js.undefined
    
    var secondsInputProps: js.UndefOr[js.Any] = js.undefined
    
    var secondsUpButtonProps: js.UndefOr[js.Any] = js.undefined
  }
  object TimeProps {
    
    @scala.inline
    def apply(): TimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeProps]
    }
    
    @scala.inline
    implicit class TimePropsMutableBuilder[Self <: TimeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHoursDownButtonProps(value: js.Any): Self = StObject.set(x, "hoursDownButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursDownButtonPropsUndefined: Self = StObject.set(x, "hoursDownButtonProps", js.undefined)
      
      @scala.inline
      def setHoursInputProps(value: js.Any): Self = StObject.set(x, "hoursInputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursInputPropsUndefined: Self = StObject.set(x, "hoursInputProps", js.undefined)
      
      @scala.inline
      def setHoursUpButtonProps(value: js.Any): Self = StObject.set(x, "hoursUpButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUpButtonPropsUndefined: Self = StObject.set(x, "hoursUpButtonProps", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLocalizedText(value: MeridiemAM): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setMeridiemDownButtonProps(value: js.Any): Self = StObject.set(x, "meridiemDownButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeridiemDownButtonPropsUndefined: Self = StObject.set(x, "meridiemDownButtonProps", js.undefined)
      
      @scala.inline
      def setMeridiemInputProps(value: js.Any): Self = StObject.set(x, "meridiemInputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeridiemInputPropsUndefined: Self = StObject.set(x, "meridiemInputProps", js.undefined)
      
      @scala.inline
      def setMeridiemUpButtonProps(value: js.Any): Self = StObject.set(x, "meridiemUpButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeridiemUpButtonPropsUndefined: Self = StObject.set(x, "meridiemUpButtonProps", js.undefined)
      
      @scala.inline
      def setMinutesDownButtonProps(value: js.Any): Self = StObject.set(x, "minutesDownButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesDownButtonPropsUndefined: Self = StObject.set(x, "minutesDownButtonProps", js.undefined)
      
      @scala.inline
      def setMinutesInputProps(value: js.Any): Self = StObject.set(x, "minutesInputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesInputPropsUndefined: Self = StObject.set(x, "minutesInputProps", js.undefined)
      
      @scala.inline
      def setMinutesUpButtonProps(value: js.Any): Self = StObject.set(x, "minutesUpButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUpButtonPropsUndefined: Self = StObject.set(x, "minutesUpButtonProps", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* time */ Hour => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSecondsDownButtonProps(value: js.Any): Self = StObject.set(x, "secondsDownButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsDownButtonPropsUndefined: Self = StObject.set(x, "secondsDownButtonProps", js.undefined)
      
      @scala.inline
      def setSecondsInputProps(value: js.Any): Self = StObject.set(x, "secondsInputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsInputPropsUndefined: Self = StObject.set(x, "secondsInputProps", js.undefined)
      
      @scala.inline
      def setSecondsUpButtonProps(value: js.Any): Self = StObject.set(x, "secondsUpButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUpButtonPropsUndefined: Self = StObject.set(x, "secondsUpButtonProps", js.undefined)
    }
  }
}
