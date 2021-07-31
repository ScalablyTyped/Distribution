package typings.ds18b20

import typings.ds18b20.ds18b20Strings.decimal
import typings.ds18b20.ds18b20Strings.default
import typings.ds18b20.ds18b20Strings.hex
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ds18b20", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sensors(callback: SensorsCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sensors")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def temperature(sensorId: String, callback: TemperatureCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("temperature")(sensorId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def temperature(sensorId: String, options: TemperatureOptions, callback: TemperatureCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("temperature")(sensorId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def temperatureSync(sensorId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("temperatureSync")(sensorId.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def temperatureSync(sensorId: String, options: TemperatureOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("temperatureSync")(sensorId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type SensorsCallback = js.Function2[/* err */ Error | Null, /* ids */ js.Array[String], Unit]
  
  type TemperatureCallback = js.Function2[/* err */ Error | Null, /* value */ Double, Unit]
  
  trait TemperatureOptions extends StObject {
    
    var parser: decimal | default | hex
  }
  object TemperatureOptions {
    
    @scala.inline
    def apply(parser: decimal | default | hex): TemperatureOptions = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemperatureOptions]
    }
    
    @scala.inline
    implicit class TemperatureOptionsMutableBuilder[Self <: TemperatureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParser(value: decimal | default | hex): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    }
  }
}
