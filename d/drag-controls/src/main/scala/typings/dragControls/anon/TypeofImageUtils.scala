package typings.dragControls.anon

import typings.std.HTMLCanvasElement
import typings.three.anon.Data
import typings.three.srcConstantsMod.Mapping
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImageUtils extends StObject {
  
  /**
    * @deprecated
    */
  var crossOrigin: String = js.native
  
  def getDataURL(image: Any): String = js.native
  
  /**
    * @deprecated Use {@link TextureLoader THREE.TextureLoader()} instead.
    */
  def loadTexture(url: String): Texture = js.native
  def loadTexture(url: String, mapping: Unit, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTexture(url: String, mapping: Unit, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): Texture = js.native
  def loadTexture(url: String, mapping: Mapping): Texture = js.native
  def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTexture(
    url: String,
    mapping: Mapping,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTexture(url: String, mapping: Mapping, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): Texture = js.native
  
  /**
    * @deprecated Use {@link CubeTextureLoader THREE.CubeTextureLoader()} instead.
    */
  def loadTextureCube(array: js.Array[String]): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Unit, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Mapping,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  
  def sRGBToLinear(image: Any): HTMLCanvasElement | Data = js.native
}
