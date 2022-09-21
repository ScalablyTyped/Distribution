package typings.glossy

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Parse {
    
    @JSImport("glossy", "Parse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(rawMessage: String): SyslogMessage | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawMessage.asInstanceOf[js.Any]).asInstanceOf[SyslogMessage | Unit]
    inline def parse(rawMessage: String, callback: ParserCallback): SyslogMessage | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawMessage.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[SyslogMessage | Unit]
    inline def parse(rawMessage: Buffer): SyslogMessage | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawMessage.asInstanceOf[js.Any]).asInstanceOf[SyslogMessage | Unit]
    inline def parse(rawMessage: Buffer, callback: ParserCallback): SyslogMessage | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawMessage.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[SyslogMessage | Unit]
  }
  
  @JSImport("glossy", "Produce")
  @js.native
  open class Produce protected () extends StObject {
    def this(options: String) = this()
    def this(options: ProduceOptions) = this()
    
    def alert(options: MessageOptions): String | Unit = js.native
    def alert(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def crit(options: MessageOptions): String | Unit = js.native
    def crit(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def debug(options: MessageOptions): String | Unit = js.native
    def debug(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def emergency(options: MessageOptions): String | Unit = js.native
    def emergency(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def info(options: MessageOptions): String | Unit = js.native
    def info(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def notice(options: MessageOptions): String | Unit = js.native
    def notice(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def produce(options: MessageOptions): String | Unit = js.native
    def produce(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
    
    def warn(options: MessageOptions): String | Unit = js.native
    def warn(options: MessageOptions, callback: ProducerCallback): String | Unit = js.native
  }
  
  trait MessageOptions extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var facility: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var msgID: js.UndefOr[String] = js.undefined
    
    var pid: js.UndefOr[String | Double] = js.undefined
    
    var prival: js.UndefOr[Double] = js.undefined
    
    var severity: js.UndefOr[String] = js.undefined
    
    var structuredData: js.UndefOr[Any] = js.undefined
    
    var time: js.UndefOr[js.Date] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMsgID(value: String): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
      
      inline def setMsgIDUndefined: Self = StObject.set(x, "msgID", js.undefined)
      
      inline def setPid(value: String | Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setPrival(value: Double): Self = StObject.set(x, "prival", value.asInstanceOf[js.Any])
      
      inline def setPrivalUndefined: Self = StObject.set(x, "prival", js.undefined)
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setStructuredData(value: Any): Self = StObject.set(x, "structuredData", value.asInstanceOf[js.Any])
      
      inline def setStructuredDataUndefined: Self = StObject.set(x, "structuredData", js.undefined)
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  type ParserCallback = js.Function1[/* parsedMessage */ SyslogMessage, Unit]
  
  trait ProduceOptions extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var facility: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var msgID: js.UndefOr[String] = js.undefined
    
    var pid: js.UndefOr[String | Double] = js.undefined
    
    var severity: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ProduceOptions {
    
    inline def apply(): ProduceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProduceOptions]
    }
    
    extension [Self <: ProduceOptions](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMsgID(value: String): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
      
      inline def setMsgIDUndefined: Self = StObject.set(x, "msgID", js.undefined)
      
      inline def setPid(value: String | Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ProducerCallback = js.Function1[/* compiledMessage */ String, Unit]
  
  trait SyslogMessage extends StObject {
    
    var appName: js.UndefOr[String | Null] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var message: String
    
    var msgID: js.UndefOr[String | Null] = js.undefined
    
    var originalMessage: String
    
    var pid: js.UndefOr[String | Null] = js.undefined
    
    var structuredData: js.UndefOr[Any] = js.undefined
    
    var time: js.Date
    
    var `type`: String
  }
  object SyslogMessage {
    
    inline def apply(message: String, originalMessage: String, time: js.Date, `type`: String): SyslogMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originalMessage = originalMessage.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyslogMessage]
    }
    
    extension [Self <: SyslogMessage](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameNull: Self = StObject.set(x, "appName", null)
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMsgID(value: String): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
      
      inline def setMsgIDNull: Self = StObject.set(x, "msgID", null)
      
      inline def setMsgIDUndefined: Self = StObject.set(x, "msgID", js.undefined)
      
      inline def setOriginalMessage(value: String): Self = StObject.set(x, "originalMessage", value.asInstanceOf[js.Any])
      
      inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidNull: Self = StObject.set(x, "pid", null)
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setStructuredData(value: Any): Self = StObject.set(x, "structuredData", value.asInstanceOf[js.Any])
      
      inline def setStructuredDataUndefined: Self = StObject.set(x, "structuredData", js.undefined)
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
