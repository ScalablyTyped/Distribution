package typings.dogapi

import typings.dogapi.anon.Aggregationkey
import typings.dogapi.anon.Apihost
import typings.dogapi.anon.Datehappened
import typings.dogapi.anon.Host
import typings.dogapi.anon.Metric
import typings.dogapi.dogapiStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dogapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait event extends StObject {
    
    def create(
      title: String,
      text: String,
      callback: js.Function2[/* err */ js.Error | Null, /* res */ EventCreateResponse, Unit]
    ): Unit = js.native
    def create(
      title: String,
      text: String,
      properties: Aggregationkey,
      callback: js.Function2[/* err */ js.Error | Null, /* res */ EventCreateResponse, Unit]
    ): Unit = js.native
  }
  @JSImport("dogapi", "event")
  @js.native
  val event: typings.dogapi.mod.event = js.native
  
  inline def initialize(opts: Apihost): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait metric extends StObject {
    
    def send_all(
      metrics: js.Array[Metric],
      callback: js.Function2[/* err */ js.Error | Null, /* res */ EventCreateResponse, Unit]
    ): Unit = js.native
    
    @JSName("send")
    def send_ok(
      metric: String,
      points: js.Array[Double],
      callback: js.Function2[/* err */ js.Error | Null, ok, Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ok(
      metric: String,
      points: js.Array[Double],
      extra: Host,
      callback: js.Function2[/* err */ js.Error | Null, ok, Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ok(metric: String, points: Double, callback: js.Function2[/* err */ js.Error | Null, ok, Unit]): Unit = js.native
    @JSName("send")
    def send_ok(
      metric: String,
      points: Double,
      extra: Host,
      callback: js.Function2[/* err */ js.Error | Null, ok, Unit]
    ): Unit = js.native
  }
  @JSImport("dogapi", "metric")
  @js.native
  val metric: typings.dogapi.mod.metric = js.native
  
  trait EventCreateResponse extends StObject {
    
    var event: Datehappened
    
    var ok: Boolean
    
    var status: ok
  }
  object EventCreateResponse {
    
    inline def apply(event: Datehappened, ok: Boolean): EventCreateResponse = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = "ok")
      __obj.asInstanceOf[EventCreateResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventCreateResponse] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Datehappened): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ok): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
