package typings.fsMerger

import typings.fsMerger.fsMergerBooleans.`false`
import typings.fsMerger.fsMergerStrings.buffer
import typings.node.NodeJS.ErrnoException
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.Recursive
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait At extends StObject {
    
    var at: Double
    
    var relativePath: String
  }
  object At {
    
    inline def apply(at: Double, relativePath: String): At = {
      val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[At]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: At] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  @js.native
  trait Typeofreaddir extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: typings.node.anon.Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: ObjectEncodingOptionswithEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: ObjectEncodingOptionswith,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Recursive,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
  }
  
  trait WithFileTypes extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithFileTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithFileTypes] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
}
