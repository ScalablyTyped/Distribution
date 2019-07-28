package typings.figlet.figletMod

import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(txt: String, cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = js.native
  def apply(
    txt: String,
    font: Fonts,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def apply(
    txt: String,
    options: js.UndefOr[Options],
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def defaults(): Defaults = js.native
  def defaults(opt: Partial[Defaults]): Defaults = js.native
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def fonts(cb: js.Function2[/* error */ Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts]], Unit]): Unit = js.native
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def fontsSync(): js.Array[Fonts] = js.native
  def loadFont(
    font: Fonts,
    cb: js.Function2[/* error */ Error | Null, /* fontOptions */ js.UndefOr[FontOptions], Unit]
  ): Unit = js.native
  /**
    * @todo
    * Use 'node' namespace to add following methods only in node environment.
    */
  /**
    * @warn
    * This method works in node environment only.
    * In browser environment, this method does not work.
    */
  def loadFontSync(font: Fonts): FontOptions = js.native
  def metadata(
    font: Fonts,
    cb: js.Function3[
      /* error */ Error | Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      /* headerComment */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
  def text(txt: String, cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = js.native
  def text(
    txt: String,
    font: Fonts,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def text(
    txt: String,
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def text(
    txt: String,
    options: Options,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def textSync(txt: String): String = js.native
  def textSync(txt: String, font: Fonts): String = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def textSync(txt: String, options: Options): String = js.native
}

