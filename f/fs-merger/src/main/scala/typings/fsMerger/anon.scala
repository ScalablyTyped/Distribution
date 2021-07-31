package typings.fsMerger

import typings.fsMerger.fsMergerBooleans.`false`
import typings.fsMerger.fsMergerStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
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
    
    @scala.inline
    def apply(at: Double, relativePath: String): At = {
      val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[At]
    }
    
    @scala.inline
    implicit class AtMutableBuilder[Self <: At] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
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
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
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
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFiEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFi,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: typings.node.anon.Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: typings.node.anon.WithFileTypes,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  trait WithFileTypes extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object WithFileTypes {
    
    @scala.inline
    def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithFileTypes]
    }
    
    @scala.inline
    implicit class WithFileTypesMutableBuilder[Self <: WithFileTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
}
