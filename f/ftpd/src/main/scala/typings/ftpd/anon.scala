package typings.ftpd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var flag: js.UndefOr[String] = js.undefined
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
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait BufferSize extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object BufferSize {
    
    @scala.inline
    def apply(): BufferSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferSize]
    }
    
    @scala.inline
    implicit class BufferSizeMutableBuilder[Self <: BufferSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    @scala.inline
    def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  trait EncodingFlag extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object EncodingFlag {
    
    @scala.inline
    def apply(): EncodingFlag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFlag]
    }
    
    @scala.inline
    implicit class EncodingFlagMutableBuilder[Self <: EncodingFlag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Flag extends StObject {
    
    var encoding: String
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Flag {
    
    @scala.inline
    def apply(encoding: String): Flag = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flag]
    }
    
    @scala.inline
    implicit class FlagMutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait Mode extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
  }
  object Mode {
    
    @scala.inline
    def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
