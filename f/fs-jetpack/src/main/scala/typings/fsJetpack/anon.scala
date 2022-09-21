package typings.fsJetpack

import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.ReadStreamOptions
import typings.node.fsMod.StreamOptions
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: BufferEncoding): ReadStream = js.native
    def apply(path: PathLike, options: ReadStreamOptions): ReadStream = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): WriteStream = js.native
    def apply(path: PathLike, options: BufferEncoding): WriteStream = js.native
    def apply(path: PathLike, options: StreamOptions): WriteStream = js.native
  }
}
