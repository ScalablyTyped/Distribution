package typings.elasticElasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  @JSImport("@elastic/elasticsearch/lib/Serializer", JSImport.Default)
  @js.native
  class default () extends Serializer
  
  @js.native
  trait Serializer extends StObject {
    
    def deserialize(json: String): js.Any = js.native
    
    def ndserialize(array: js.Array[_]): String = js.native
    
    def qserialize(`object`: js.Any): String = js.native
    
    def serialize(`object`: js.Any): String = js.native
  }
  object Serializer {
    
    @scala.inline
    def apply(
      deserialize: String => js.Any,
      ndserialize: js.Array[_] => String,
      qserialize: js.Any => String,
      serialize: js.Any => String
    ): Serializer = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), ndserialize = js.Any.fromFunction1(ndserialize), qserialize = js.Any.fromFunction1(qserialize), serialize = js.Any.fromFunction1(serialize))
      __obj.asInstanceOf[Serializer]
    }
    
    @scala.inline
    implicit class SerializerMutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeserialize(value: String => js.Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNdserialize(value: js.Array[_] => String): Self = StObject.set(x, "ndserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQserialize(value: js.Any => String): Self = StObject.set(x, "qserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerialize(value: js.Any => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    }
  }
}
