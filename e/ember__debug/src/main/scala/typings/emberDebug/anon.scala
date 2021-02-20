package typings.emberDebug

import typings.emberDebug.dataAdapterMod.DataAdapter.Column
import typings.std.ObjectConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var id: js.UndefOr[String] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait Columns extends StObject {
    
    var columns: js.Array[Column] = js.native
    
    var count: Double = js.native
    
    var name: String = js.native
    
    def `object`(): js.Any = js.native
    def `object`(value: js.Any): js.Any = js.native
    @JSName("object")
    var object_Original: ObjectConstructor = js.native
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var until: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, until: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IdString extends StObject {
    
    var id: String = js.native
  }
  object IdString {
    
    @scala.inline
    def apply(id: String): IdString = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdString]
    }
    
    @scala.inline
    implicit class IdStringMutableBuilder[Self <: IdString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Until extends StObject {
    
    /**
      * A unique id for this deprecation. The id can be used by Ember debugging
      * tools to change the behavior (raise, log or silence) for that specific
      * deprecation. The id should be namespaced by dots, e.g.
      * `"view.helper.select"`.
      */
    var id: String = js.native
    
    /**
      * The version of Ember when this deprecation warning will be removed.
      */
    var until: String = js.native
    
    /**
      * An optional url to the transition guide on the emberjs.com website.
      */
    var url: js.UndefOr[String] = js.native
  }
  object Until {
    
    @scala.inline
    def apply(id: String, until: String): Until = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
      __obj.asInstanceOf[Until]
    }
    
    @scala.inline
    implicit class UntilMutableBuilder[Self <: Until] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
