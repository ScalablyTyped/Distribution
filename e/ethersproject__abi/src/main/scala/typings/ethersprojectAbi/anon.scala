package typings.ethersprojectAbi

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: String = js.native
    
    var topics: js.Array[String] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: String, topics: js.Array[String]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: typings.std.Error = js.native
    
    var path: js.Array[String | Double] = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error, path: js.Array[String | Double]): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Topics extends StObject {
    
    var data: String = js.native
    
    var topics: js.Array[String] = js.native
  }
  object Topics {
    
    @scala.inline
    def apply(data: String, topics: js.Array[String]): Topics = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Topics]
    }
    
    @scala.inline
    implicit class TopicsMutableBuilder[Self <: Topics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var data: String = js.native
    
    var value: js.UndefOr[BigNumberish] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(data: String): Value = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
