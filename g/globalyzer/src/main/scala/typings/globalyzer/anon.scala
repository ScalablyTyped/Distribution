package typings.globalyzer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base extends StObject {
    
    var base: String = js.native
    
    var glob: String = js.native
    
    var isGlob: Boolean = js.native
  }
  object Base {
    
    @scala.inline
    def apply(base: String, glob: String, isGlob: Boolean): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Strict extends StObject {
    
    /**
      * Use strict parsing (be strict about what's a glob and what's not)
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object Strict {
    
    @scala.inline
    def apply(): Strict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Strict]
    }
    
    @scala.inline
    implicit class StrictMutableBuilder[Self <: Strict] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
