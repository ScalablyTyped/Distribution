package typings.ejson

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ejson", "clone")
  @js.native
  def clone_[T](obj: T): T = js.native
  
  @JSImport("ejson", "equals")
  @js.native
  def equals_(a: js.Any, b: js.Any): Boolean = js.native
  @JSImport("ejson", "equals")
  @js.native
  def equals_(a: js.Any, b: js.Any, options: CloneOptions): Boolean = js.native
  
  @JSImport("ejson", "fromJSONValue")
  @js.native
  def fromJSONValue(obj: String): js.Any = js.native
  
  @JSImport("ejson", "isBinary")
  @js.native
  def isBinary(value: js.Any): Boolean = js.native
  
  @JSImport("ejson", "newBinary")
  @js.native
  def newBinary(len: Double): Uint8Array = js.native
  
  @JSImport("ejson", "parse")
  @js.native
  def parse(str: String): js.Any = js.native
  
  @JSImport("ejson", "stringify")
  @js.native
  def stringify(obj: js.Any): String = js.native
  @JSImport("ejson", "stringify")
  @js.native
  def stringify(obj: js.Any, options: StringifyOptions): String = js.native
  
  @JSImport("ejson", "toJSONValue")
  @js.native
  def toJSONValue(obj: js.Any): String = js.native
  
  @js.native
  trait CloneOptions extends StObject {
    
    var keyOrderSensitive: Boolean = js.native
  }
  object CloneOptions {
    
    @scala.inline
    def apply(keyOrderSensitive: Boolean): CloneOptions = {
      val __obj = js.Dynamic.literal(keyOrderSensitive = keyOrderSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneOptions]
    }
    
    @scala.inline
    implicit class CloneOptionsMutableBuilder[Self <: CloneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyOrderSensitive(value: Boolean): Self = StObject.set(x, "keyOrderSensitive", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StringifyOptions extends StObject {
    
    var canonical: Boolean = js.native
    
    var indent: Boolean | Double | String = js.native
  }
  object StringifyOptions {
    
    @scala.inline
    def apply(canonical: Boolean, indent: Boolean | Double | String): StringifyOptions = {
      val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit class StringifyOptionsMutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: Boolean | Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    }
  }
}
