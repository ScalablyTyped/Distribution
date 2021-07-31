package typings.fsMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BufferSize extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
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
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: String
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    @scala.inline
    def apply(encoding: String): Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
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
  
  trait Fd extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object Fd {
    
    @scala.inline
    def apply(): Fd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fd]
    }
    
    @scala.inline
    implicit class FdMutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
      
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
  
  trait Flag extends StObject {
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Flag {
    
    @scala.inline
    def apply(): Flag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag]
    }
    
    @scala.inline
    implicit class FlagMutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait Flags extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
  }
  object Flags {
    
    @scala.inline
    def apply(): Flags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
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
  
  trait Interval extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object Interval {
    
    @scala.inline
    def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
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
  
  trait Persistent extends StObject {
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object Persistent {
    
    @scala.inline
    def apply(): Persistent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Persistent]
    }
    
    @scala.inline
    implicit class PersistentMutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
