package typings.duplexify

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("duplexify", JSImport.Namespace)
  @js.native
  class ^ () extends Duplexify {
    def this(writable: Writable) = this()
    def this(writable: js.UndefOr[scala.Nothing], readable: Readable) = this()
    def this(writable: Writable, readable: Readable) = this()
    def this(
      writable: js.UndefOr[scala.Nothing],
      readable: js.UndefOr[scala.Nothing],
      streamOptions: DuplexOptions
    ) = this()
    def this(writable: js.UndefOr[scala.Nothing], readable: Readable, streamOptions: DuplexOptions) = this()
    def this(writable: Writable, readable: js.UndefOr[scala.Nothing], streamOptions: DuplexOptions) = this()
    def this(writable: Writable, readable: Readable, streamOptions: DuplexOptions) = this()
  }
  @JSImport("duplexify", JSImport.Namespace)
  @js.native
  val ^ : DuplexifyConstructor = js.native
  
  @js.native
  trait Duplexify extends Duplex {
    
    def setReadable(readable: Readable): Unit = js.native
    
    def setWritable(writable: Writable): Unit = js.native
  }
  
  @js.native
  trait DuplexifyConstructor
    extends Instantiable0[Duplexify]
       with Instantiable1[/* writable */ Writable, Duplexify]
       with Instantiable2[js.UndefOr[/* writable */ Writable], /* readable */ Readable, Duplexify]
       with Instantiable3[
          js.UndefOr[/* writable */ Writable], 
          js.UndefOr[/* readable */ Readable], 
          /* streamOptions */ DuplexOptions, 
          Duplexify
        ] {
    
    def apply(): Duplexify = js.native
    def apply(
      writable: js.UndefOr[scala.Nothing],
      readable: js.UndefOr[scala.Nothing],
      streamOptions: DuplexOptions
    ): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: Readable): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: Readable, streamOptions: DuplexOptions): Duplexify = js.native
    def apply(writable: Writable): Duplexify = js.native
    def apply(writable: Writable, readable: js.UndefOr[scala.Nothing], streamOptions: DuplexOptions): Duplexify = js.native
    def apply(writable: Writable, readable: Readable): Duplexify = js.native
    def apply(writable: Writable, readable: Readable, streamOptions: DuplexOptions): Duplexify = js.native
    
    def obj(): Duplexify = js.native
    def obj(
      writable: js.UndefOr[scala.Nothing],
      readable: js.UndefOr[scala.Nothing],
      streamOptions: DuplexOptions
    ): Duplexify = js.native
    def obj(writable: js.UndefOr[scala.Nothing], readable: Readable): Duplexify = js.native
    def obj(writable: js.UndefOr[scala.Nothing], readable: Readable, streamOptions: DuplexOptions): Duplexify = js.native
    def obj(writable: Writable): Duplexify = js.native
    def obj(writable: Writable, readable: js.UndefOr[scala.Nothing], streamOptions: DuplexOptions): Duplexify = js.native
    def obj(writable: Writable, readable: Readable): Duplexify = js.native
    def obj(writable: Writable, readable: Readable, streamOptions: DuplexOptions): Duplexify = js.native
  }
  
  type _To = DuplexifyConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DuplexifyConstructor = ^
}
