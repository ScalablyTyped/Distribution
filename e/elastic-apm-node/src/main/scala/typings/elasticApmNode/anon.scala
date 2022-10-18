package typings.elasticApmNode

import typings.elasticApmNode.typesConnectMod.Connect.ErrorHandleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connect extends StObject {
    
    def connect(): ErrorHandleFunction
  }
  object Connect {
    
    inline def apply(connect: () => ErrorHandleFunction): Connect = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
      __obj.asInstanceOf[Connect]
    }
    
    extension [Self <: Connect](x: Self) {
      
      inline def setConnect(value: () => ErrorHandleFunction): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Spanid extends StObject {
    
    @JSName("span.id")
    var spanDotid: js.UndefOr[String] = js.undefined
    
    @JSName("trace.id")
    var traceDotid: js.UndefOr[String] = js.undefined
    
    @JSName("transaction.id")
    var transactionDotid: js.UndefOr[String] = js.undefined
  }
  object Spanid {
    
    inline def apply(): Spanid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Spanid]
    }
    
    extension [Self <: Spanid](x: Self) {
      
      inline def setSpanDotid(value: String): Self = StObject.set(x, "span.id", value.asInstanceOf[js.Any])
      
      inline def setSpanDotidUndefined: Self = StObject.set(x, "span.id", js.undefined)
      
      inline def setTraceDotid(value: String): Self = StObject.set(x, "trace.id", value.asInstanceOf[js.Any])
      
      inline def setTraceDotidUndefined: Self = StObject.set(x, "trace.id", js.undefined)
      
      inline def setTransactionDotid(value: String): Self = StObject.set(x, "transaction.id", value.asInstanceOf[js.Any])
      
      inline def setTransactionDotidUndefined: Self = StObject.set(x, "transaction.id", js.undefined)
    }
  }
  
  trait Traceid extends StObject {
    
    @JSName("span.id")
    var spanDotid: String
    
    @JSName("trace.id")
    var traceDotid: String
  }
  object Traceid {
    
    inline def apply(spanDotid: String, traceDotid: String): Traceid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("span.id")(spanDotid.asInstanceOf[js.Any])
      __obj.updateDynamic("trace.id")(traceDotid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Traceid]
    }
    
    extension [Self <: Traceid](x: Self) {
      
      inline def setSpanDotid(value: String): Self = StObject.set(x, "span.id", value.asInstanceOf[js.Any])
      
      inline def setTraceDotid(value: String): Self = StObject.set(x, "trace.id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transactionid extends StObject {
    
    @JSName("trace.id")
    var traceDotid: String
    
    @JSName("transaction.id")
    var transactionDotid: String
  }
  object Transactionid {
    
    inline def apply(traceDotid: String, transactionDotid: String): Transactionid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("trace.id")(traceDotid.asInstanceOf[js.Any])
      __obj.updateDynamic("transaction.id")(transactionDotid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transactionid]
    }
    
    extension [Self <: Transactionid](x: Self) {
      
      inline def setTraceDotid(value: String): Self = StObject.set(x, "trace.id", value.asInstanceOf[js.Any])
      
      inline def setTransactionDotid(value: String): Self = StObject.set(x, "transaction.id", value.asInstanceOf[js.Any])
    }
  }
}
