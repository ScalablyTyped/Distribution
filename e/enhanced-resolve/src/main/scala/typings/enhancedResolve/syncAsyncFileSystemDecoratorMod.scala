package typings.enhancedResolve

import typings.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncAsyncFileSystemDecoratorMod {
  
  @JSImport("enhanced-resolve/lib/SyncAsyncFileSystemDecorator", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with SyncAsyncFileSystemDecorator {
    def this(fs: AbstractInputFileSystem) = this()
    
    /* CompleteClass */
    var fs: AbstractInputFileSystem = js.native
  }
  
  trait SyncAsyncFileSystemDecorator extends StObject {
    
    var fs: AbstractInputFileSystem
    
    var readFile: js.UndefOr[
        js.Function2[
          /* filename */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var readJson: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var readdir: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var readlink: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var stat: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object SyncAsyncFileSystemDecorator {
    
    @scala.inline
    def apply(fs: AbstractInputFileSystem): SyncAsyncFileSystemDecorator = {
      val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncAsyncFileSystemDecorator]
    }
    
    @scala.inline
    implicit class SyncAsyncFileSystemDecoratorMutableBuilder[Self <: SyncAsyncFileSystemDecorator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: AbstractInputFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFile(
        value: (/* filename */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit]) => Unit
      ): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      @scala.inline
      def setReadJson(
        value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit]) => Unit
      ): Self = StObject.set(x, "readJson", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadJsonUndefined: Self = StObject.set(x, "readJson", js.undefined)
      
      @scala.inline
      def setReaddir(
        value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit]) => Unit
      ): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      @scala.inline
      def setReadlink(
        value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "readlink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadlinkUndefined: Self = StObject.set(x, "readlink", js.undefined)
      
      @scala.inline
      def setStat(
        value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]) => Unit
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
}
