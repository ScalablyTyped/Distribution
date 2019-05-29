package typings
package figletLib.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    txt: java.lang.String,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    txt: java.lang.String,
    font: Fonts,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def apply(
    txt: java.lang.String,
    options: js.UndefOr[Options],
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def defaults(): Defaults = js.native
  def defaults(opt: stdLib.Partial[Defaults]): Defaults = js.native
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def fonts(
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* fontList */ js.UndefOr[js.Array[Fonts]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def fontsSync(): js.Array[Fonts] = js.native
  def loadFont(
    font: Fonts,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      scala.Unit
    ]
  ): scala.Unit = js.native
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
      /* error */ stdLib.Error | scala.Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      /* headerComment */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def text(
    txt: java.lang.String,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def text(
    txt: java.lang.String,
    font: Fonts,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def text(
    txt: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def text(
    txt: java.lang.String,
    options: Options,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def textSync(txt: java.lang.String): java.lang.String = js.native
  def textSync(txt: java.lang.String, font: Fonts): java.lang.String = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def textSync(txt: java.lang.String, options: Options): java.lang.String = js.native
}

