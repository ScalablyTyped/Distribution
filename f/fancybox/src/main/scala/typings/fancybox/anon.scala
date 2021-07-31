package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoStart_ extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object AutoStart_ {
    
    @scala.inline
    def apply(): AutoStart_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoStart_]
    }
    
    @scala.inline
    implicit class AutoStart_MutableBuilder[Self <: AutoStart_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  trait Autostart extends StObject {
    
    var autostart: Boolean
  }
  object Autostart {
    
    @scala.inline
    def apply(autostart: Boolean): Autostart = {
      val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autostart]
    }
    
    @scala.inline
    implicit class AutostartMutableBuilder[Self <: Autostart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Left {
    
    @scala.inline
    def apply(): Left = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
