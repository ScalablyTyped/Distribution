package typings.fileServicesTypes

import typings.fileServicesTypes.distCommonFsTypesMod.BufferEncoding
import typings.fileServicesTypes.distCommonFsTypesMod.IFileSystemStats
import typings.fileServicesTypes.distCommonFsTypesMod.StatSyncOptions
import typings.fileServicesTypes.distCommonFsTypesMod._ReadFileOptions
import typings.fileServicesTypes.distCommonFsTypesMod._WriteFileOptions
import typings.fileServicesTypes.fileServicesTypesBooleans.`false`
import typings.fileServicesTypes.fileServicesTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var withFileTypes: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait EncodingBufferEncoding extends StObject {
    
    var encoding: BufferEncoding
  }
  object EncodingBufferEncoding {
    
    inline def apply(encoding: BufferEncoding): EncodingBufferEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingBufferEncoding]
    }
    
    extension [Self <: EncodingBufferEncoding](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncodingFlag
    extends StObject
       with _ReadFileOptions {
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object EncodingFlag {
    
    inline def apply(): EncodingFlag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFlag]
    }
    
    extension [Self <: EncodingFlag](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait EncodingWithFileTypes extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object EncodingWithFileTypes {
    
    inline def apply(): EncodingWithFileTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingWithFileTypes]
    }
    
    extension [Self <: EncodingWithFileTypes](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  trait Flag extends StObject {
    
    var encoding: BufferEncoding
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Flag {
    
    inline def apply(encoding: BufferEncoding): Flag = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flag]
    }
    
    extension [Self <: Flag](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: String): js.UndefOr[IFileSystemStats] = js.native
    def apply(path: String, options: StatSyncOptionsthrowIfNoE): IFileSystemStats = js.native
    def apply(path: String, options: StatSyncOptionsthrowIfNoEThrowIfNoEntry): js.UndefOr[IFileSystemStats] = js.native
    def apply(path: String, options: StatSyncOptions): js.UndefOr[IFileSystemStats] = js.native
  }
  
  trait Mode
    extends StObject
       with _WriteFileOptions {
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double | String] = js.undefined
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Recursive extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Recursive {
    
    inline def apply(): Recursive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recursive]
    }
    
    extension [Self <: Recursive](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  /* Inlined @file-services/types.@file-services/types/dist/common-fs-types.StatSyncOptions & {  throwIfNoEntry :true | undefined} */
  trait StatSyncOptionsthrowIfNoE extends StObject {
    
    /**
      * Whether an exception will be thrown if no file system entry exists, rather than returning `undefined`.
      * @default true
      */
    var throwIfNoEntry: js.UndefOr[Boolean] & js.UndefOr[`true`]
  }
  object StatSyncOptionsthrowIfNoE {
    
    inline def apply(throwIfNoEntry: js.UndefOr[Boolean] & js.UndefOr[`true`]): StatSyncOptionsthrowIfNoE = {
      val __obj = js.Dynamic.literal(throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatSyncOptionsthrowIfNoE]
    }
    
    extension [Self <: StatSyncOptionsthrowIfNoE](x: Self) {
      
      inline def setThrowIfNoEntry(value: js.UndefOr[Boolean] & js.UndefOr[`true`]): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @file-services/types.@file-services/types/dist/common-fs-types.StatSyncOptions & {  throwIfNoEntry :false} */
  trait StatSyncOptionsthrowIfNoEThrowIfNoEntry extends StObject {
    
    /**
      * Whether an exception will be thrown if no file system entry exists, rather than returning `undefined`.
      * @default true
      */
    var throwIfNoEntry: js.UndefOr[Boolean] & `false`
  }
  object StatSyncOptionsthrowIfNoEThrowIfNoEntry {
    
    inline def apply(throwIfNoEntry: js.UndefOr[Boolean] & `false`): StatSyncOptionsthrowIfNoEThrowIfNoEntry = {
      val __obj = js.Dynamic.literal(throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatSyncOptionsthrowIfNoEThrowIfNoEntry]
    }
    
    extension [Self <: StatSyncOptionsthrowIfNoEThrowIfNoEntry](x: Self) {
      
      inline def setThrowIfNoEntry(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithFileTypes extends StObject {
    
    var encoding: BufferEncoding | Null
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal(encoding = null)
      __obj.asInstanceOf[WithFileTypes]
    }
    
    extension [Self <: WithFileTypes](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
}
