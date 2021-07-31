package typings.fileEntryCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hash extends StObject {
    
    val hash: js.UndefOr[String] = js.undefined
    
    val mtime: js.UndefOr[Double] = js.undefined
    
    val size: js.UndefOr[Double] = js.undefined
  }
  object Hash {
    
    @scala.inline
    def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
