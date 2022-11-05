package typings.fsMinipass

import typings.fsMinipass.anon.AutoClose
import typings.fsMinipass.anon.Fd
import typings.fsMinipass.fsMinipassBooleans.`false`
import typings.fsMinipass.fsMinipassBooleans.`true`
import typings.minipass.mod.Encoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Minipass * / any */ @JSImport("fs-minipass", "ReadStream")
  @js.native
  open class ReadStream protected () extends StObject {
    def this(path: String) = this()
    def this(path: String, options: AutoClose) = this()
    
    def fd: Double = js.native
    
    def path: String = js.native
    
    var readable: `false` = js.native
    
    var writeable: `true` = js.native
  }
  
  @JSImport("fs-minipass", "ReadStreamSync")
  @js.native
  open class ReadStreamSync protected () extends ReadStream {
    def this(path: String) = this()
    def this(path: String, options: AutoClose) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Minipass * / any */ @JSImport("fs-minipass", "WriteStream")
  @js.native
  open class WriteStream protected () extends StObject {
    def this(path: String) = this()
    def this(path: String, options: Fd) = this()
    
    def end(): scala.Nothing = js.native
    def end(buf: String, enc: BufferEncoding): this.type = js.native
    def end(buf: String, enc: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
    def end(buf: Buffer, enc: BufferEncoding): this.type = js.native
    def end(buf: Buffer, enc: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
    def end(cb: js.Function0[Unit]): scala.Nothing = js.native
    def end(chunk: Any): scala.Nothing = js.native
    def end(chunk: Any, cb: js.Function0[Unit]): scala.Nothing = js.native
    def end(chunk: Any, encoding: Unit, cb: js.Function0[Unit]): scala.Nothing = js.native
    def end(chunk: Any, encoding: Encoding): scala.Nothing = js.native
    def end(chunk: Any, encoding: Encoding, cb: js.Function0[Unit]): scala.Nothing = js.native
    
    def fd: Double = js.native
    
    def path: String = js.native
    
    def write(buf: String, enc: BufferEncoding): Boolean = js.native
    def write(buf: Buffer, enc: BufferEncoding): Boolean = js.native
    def write(chunk: Any): scala.Nothing = js.native
    def write(chunk: Any, cb: js.Function0[Unit]): scala.Nothing = js.native
    def write(chunk: Any, encoding: Unit, cb: js.Function0[Unit]): scala.Nothing = js.native
    def write(chunk: Any, encoding: Encoding): scala.Nothing = js.native
    def write(chunk: Any, encoding: Encoding, cb: js.Function0[Unit]): scala.Nothing = js.native
  }
  
  @JSImport("fs-minipass", "WriteStreamSync")
  @js.native
  open class WriteStreamSync protected () extends WriteStream {
    def this(path: String) = this()
    def this(path: String, options: Fd) = this()
  }
}
