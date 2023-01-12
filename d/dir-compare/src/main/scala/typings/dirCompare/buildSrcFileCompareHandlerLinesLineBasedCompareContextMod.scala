package typings.dirCompare

import typings.dirCompare.buildSrcFileSystemBufferPoolMod.BufferPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFileCompareHandlerLinesLineBasedCompareContextMod {
  
  @JSImport("dir-compare/build/src/FileCompareHandler/lines/LineBasedCompareContext", "LineBasedCompareContext")
  @js.native
  open class LineBasedCompareContext protected () extends StObject {
    def this(fd1: Double, fd2: Double, bufferPair: BufferPair) = this()
    
    /**
      * Buffers used as temporary storage.
      */
    var buffer: BufferPair = js.native
    
    /**
      * File to compare.
      */
    var fd1: Double = js.native
    
    /**
      * File to compare.
      */
    var fd2: Double = js.native
    
    /**
      * Part of a line that was split at buffer boundary in a previous read.
      * Will be prefixed to the next read.
      */
    var rest: RestPair = js.native
    
    /**
      * Lines that remain unprocessed from a previous read.
      * Will be prefixed to the next read.
      */
    var restLines: RestLines = js.native
  }
  
  trait RestLines extends StObject {
    
    var restLines1: js.Array[String]
    
    var restLines2: js.Array[String]
  }
  object RestLines {
    
    inline def apply(restLines1: js.Array[String], restLines2: js.Array[String]): RestLines = {
      val __obj = js.Dynamic.literal(restLines1 = restLines1.asInstanceOf[js.Any], restLines2 = restLines2.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestLines] (val x: Self) extends AnyVal {
      
      inline def setRestLines1(value: js.Array[String]): Self = StObject.set(x, "restLines1", value.asInstanceOf[js.Any])
      
      inline def setRestLines1Varargs(value: String*): Self = StObject.set(x, "restLines1", js.Array(value*))
      
      inline def setRestLines2(value: js.Array[String]): Self = StObject.set(x, "restLines2", value.asInstanceOf[js.Any])
      
      inline def setRestLines2Varargs(value: String*): Self = StObject.set(x, "restLines2", js.Array(value*))
    }
  }
  
  trait RestPair extends StObject {
    
    var rest1: String
    
    var rest2: String
  }
  object RestPair {
    
    inline def apply(rest1: String, rest2: String): RestPair = {
      val __obj = js.Dynamic.literal(rest1 = rest1.asInstanceOf[js.Any], rest2 = rest2.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestPair] (val x: Self) extends AnyVal {
      
      inline def setRest1(value: String): Self = StObject.set(x, "rest1", value.asInstanceOf[js.Any])
      
      inline def setRest2(value: String): Self = StObject.set(x, "rest2", value.asInstanceOf[js.Any])
    }
  }
}
