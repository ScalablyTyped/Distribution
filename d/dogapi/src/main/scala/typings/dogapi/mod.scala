package typings.dogapi

import typings.dogapi.anon.Aggregationkey
import typings.dogapi.anon.Apihost
import typings.dogapi.anon.Datehappened
import typings.dogapi.anon.Host
import typings.dogapi.anon.Metric
import typings.dogapi.dogapiStrings.ok
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait event extends StObject {
    
    def create(
      title: String,
      text: String,
      callback: js.Function2[/* err */ Error | Null, /* res */ EventCreateResponse, Unit]
    ): Unit = js.native
    def create(
      title: String,
      text: String,
      properties: Aggregationkey,
      callback: js.Function2[/* err */ Error | Null, /* res */ EventCreateResponse, Unit]
    ): Unit = js.native
  }
  @JSImport("dogapi", "event")
  @js.native
  val event: typings.dogapi.mod.event = js.native
  
  @JSImport("dogapi", "initialize")
  @js.native
  def initialize(opts: Apihost): Unit = js.native
  
  @js.native
  trait metric extends StObject {
    
    def send_all(
      metrics: js.Array[Metric],
      callback: js.Function2[/* err */ Error | Null, /* res */ EventCreateResponse, Unit]
    ): Unit = js.native
    
    @JSName("send")
    def send_ok(metric: String, points: js.Array[Double], callback: js.Function2[/* err */ Error | Null, ok, Unit]): Unit = js.native
    @JSName("send")
    def send_ok(
      metric: String,
      points: js.Array[Double],
      extra: Host,
      callback: js.Function2[/* err */ Error | Null, ok, Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ok(metric: String, points: Double, callback: js.Function2[/* err */ Error | Null, ok, Unit]): Unit = js.native
    @JSName("send")
    def send_ok(
      metric: String,
      points: Double,
      extra: Host,
      callback: js.Function2[/* err */ Error | Null, ok, Unit]
    ): Unit = js.native
  }
  @JSImport("dogapi", "metric")
  @js.native
  val metric: typings.dogapi.mod.metric = js.native
  
  @js.native
  trait EventCreateResponse extends StObject {
    
    var event: Datehappened = js.native
    
    var ok: Boolean = js.native
    
    var status: ok = js.native
  }
  object EventCreateResponse {
    
    @scala.inline
    def apply(event: Datehappened, ok: Boolean, status: ok): EventCreateResponse = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventCreateResponse]
    }
    
    @scala.inline
    implicit class EventCreateResponseMutableBuilder[Self <: EventCreateResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: Datehappened): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ok): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
