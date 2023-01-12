package typings.gamedig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Docnotes extends StObject {
    
    var doc_notes: js.UndefOr[String] = js.undefined
  }
  object Docnotes {
    
    inline def apply(): Docnotes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Docnotes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Docnotes] (val x: Self) extends AnyVal {
      
      inline def setDoc_notes(value: String): Self = StObject.set(x, "doc_notes", value.asInstanceOf[js.Any])
      
      inline def setDoc_notesUndefined: Self = StObject.set(x, "doc_notes", js.undefined)
    }
  }
  
  trait Extra extends StObject {
    
    var extra: Docnotes
    
    var keys: js.Array[String]
    
    var options: Port
    
    var pretty: String
  }
  object Extra {
    
    inline def apply(extra: Docnotes, keys: js.Array[String], options: Port, pretty: String): Extra = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pretty = pretty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extra]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
      
      inline def setExtra(value: Docnotes): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setOptions(value: Port): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPretty(value: String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListenUdpPort extends StObject {
    
    var listenUdpPort: js.UndefOr[Double] = js.undefined
  }
  object ListenUdpPort {
    
    inline def apply(): ListenUdpPort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenUdpPort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenUdpPort] (val x: Self) extends AnyVal {
      
      inline def setListenUdpPort(value: Double): Self = StObject.set(x, "listenUdpPort", value.asInstanceOf[js.Any])
      
      inline def setListenUdpPortUndefined: Self = StObject.set(x, "listenUdpPort", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
    
    var port_query: js.UndefOr[Double] = js.undefined
    
    var port_query_offset: js.UndefOr[Double] = js.undefined
    
    var protocol: String
  }
  object Port {
    
    inline def apply(protocol: String): Port = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPort_query(value: Double): Self = StObject.set(x, "port_query", value.asInstanceOf[js.Any])
      
      inline def setPort_queryUndefined: Self = StObject.set(x, "port_query", js.undefined)
      
      inline def setPort_query_offset(value: Double): Self = StObject.set(x, "port_query_offset", value.asInstanceOf[js.Any])
      
      inline def setPort_query_offsetUndefined: Self = StObject.set(x, "port_query_offset", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
