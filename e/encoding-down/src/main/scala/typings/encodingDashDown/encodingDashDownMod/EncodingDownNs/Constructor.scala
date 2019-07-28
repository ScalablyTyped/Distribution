package typings.encodingDashDown.encodingDashDownMod.EncodingDownNs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.encodingDashDown.encodingDashDownMod.EncodingDown
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends // tslint:disable-next-line:no-unnecessary-generics
Instantiable1[/* db */ AbstractLevelDOWN[js.Any, js.Any], EncodingDown[js.Object, js.Object]]
     with Instantiable2[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      /* options */ CodecOptions, 
      EncodingDown[js.Object, js.Object]
    ] {
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[K, V](db: AbstractLevelDOWN[_, _]): EncodingDown[K, V] = js.native
  def apply[K, V](db: AbstractLevelDOWN[_, _], options: CodecOptions): EncodingDown[K, V] = js.native
}

