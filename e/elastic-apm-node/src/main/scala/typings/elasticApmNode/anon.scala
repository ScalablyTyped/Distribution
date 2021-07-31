package typings.elasticApmNode

import typings.elasticApmNode.mod.Connect.ErrorHandleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connect extends StObject {
    
    def connect(): ErrorHandleFunction
  }
  object Connect {
    
    @scala.inline
    def apply(connect: () => ErrorHandleFunction): Connect = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
      __obj.asInstanceOf[Connect]
    }
    
    @scala.inline
    implicit class ConnectMutableBuilder[Self <: Connect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => ErrorHandleFunction): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
    
    @scala.inline
    def apply(): Spanid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Spanid]
    }
    
    @scala.inline
    implicit class SpanidMutableBuilder[Self <: Spanid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpanDotid(value: String): Self = StObject.set(x, "span.id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanDotidUndefined: Self = StObject.set(x, "span.id", js.undefined)
      
      @scala.inline
      def setTraceDotid(value: String): Self = StObject.set(x, "trace.id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceDotidUndefined: Self = StObject.set(x, "trace.id", js.undefined)
      
      @scala.inline
      def setTransactionDotid(value: String): Self = StObject.set(x, "transaction.id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionDotidUndefined: Self = StObject.set(x, "transaction.id", js.undefined)
    }
  }
}
