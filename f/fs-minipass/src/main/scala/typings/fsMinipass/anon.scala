package typings.fsMinipass

import typings.node.fsMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoClose extends StObject {
    
    /**
      * Set to false to prevent the file descriptor from being closed when the file is done being read.
      */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass in a numeric file descriptor, if the file is already open.
      */
    var fd: js.UndefOr[Double] = js.undefined
    
    /**
      * The size of reads to do, defaults to 16MB
      */
    var readSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The size of the file, if known. Prevents zero-byte read() call at the end.
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object AutoClose {
    
    inline def apply(): AutoClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoClose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoClose] (val x: Self) extends AnyVal {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setReadSize(value: Double): Self = StObject.set(x, "readSize", value.asInstanceOf[js.Any])
      
      inline def setReadSizeUndefined: Self = StObject.set(x, "readSize", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Fd extends StObject {
    
    /**
      * Set to false to prevent the file descriptor from being closed when the stream is ended.
      */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass in a numeric file descriptor, if the file is already open.
      */
    var fd: js.UndefOr[Double] = js.undefined
    
    /**
      * Flags to use when opening the file. Irrelevant if fd is passed in, since file won't be opened in that case. Defaults to 'a' if a pos is specified, or 'w' otherwise.
      */
    var flags: js.UndefOr[String] = js.undefined
    
    /**
      * The mode to create the file with. Defaults to 0o666.
      */
    var mode: js.UndefOr[Mode] = js.undefined
    
    /**
      *  The position in the file to start reading. If not specified, then the file will start writing at position zero, and be truncated by default.
      */
    var start: js.UndefOr[Double] = js.undefined
  }
  object Fd {
    
    inline def apply(): Fd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
