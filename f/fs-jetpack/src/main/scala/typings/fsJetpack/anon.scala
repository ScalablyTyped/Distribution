package typings.fsJetpack

import typings.node.anon.AutoClose
import typings.node.anon.EmitClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: String): ReadStream = js.native
    def apply(path: PathLike, options: AutoClose): ReadStream = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): WriteStream = js.native
    def apply(path: PathLike, options: String): WriteStream = js.native
    def apply(path: PathLike, options: EmitClose): WriteStream = js.native
  }
}
