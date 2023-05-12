package typings.figlet

import typings.figlet.anon.PartialDefaults
import typings.figlet.mod.Defaults_
import typings.figlet.mod.FontOptions
import typings.figlet.mod.Fonts_
import typings.figlet.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object figlet {
    
    inline def apply(txt: String, cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      txt: String,
      font: Fonts_,
      cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      txt: String,
      // This `unified-signatures` is disabled because `Fonts` type is too long
    // tslint:disable-next-line: unified-signatures
    options: Unit,
      cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      txt: String,
      // This `unified-signatures` is disabled because `Fonts` type is too long
    // tslint:disable-next-line: unified-signatures
    options: Options,
      cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("figlet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaults(): Defaults_ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Defaults_]
    inline def defaults(opt: PartialDefaults): Defaults_ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt.asInstanceOf[js.Any]).asInstanceOf[Defaults_]
    
    /**
      * @warn
      * This method exists in node environment only.
      * In browser environment, this method does not exist.
      */
    inline def fonts(cb: js.Function2[/* error */ js.Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts_]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fonts")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @warn
      * This method exists in node environment only.
      * In browser environment, this method does not exist.
      */
    inline def fontsSync(): js.Array[Fonts_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontsSync")().asInstanceOf[js.Array[Fonts_]]
    
    inline def loadFont(
      font: Fonts_,
      cb: js.Function2[/* error */ js.Error | Null, /* fontOptions */ js.UndefOr[FontOptions], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @todo
      * Use 'node' namespace to add following methods only in node environment.
      */
    /**
      * @warn
      * This method works in node environment only.
      * In browser environment, this method does not work.
      */
    inline def loadFontSync(font: Fonts_): FontOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFontSync")(font.asInstanceOf[js.Any]).asInstanceOf[FontOptions]
    
    inline def metadata(
      font: Fonts_,
      cb: js.Function3[
          /* error */ js.Error | Null, 
          /* fontOptions */ js.UndefOr[FontOptions], 
          /* headerComment */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description
      * Load a custom font from a file.
      *
      * @param fontName
      * The name you want to give the new font.
      * @param fontFile
      * The data from the font file.
      */
    inline def parseFont(fontName: String, fontFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFont")(fontName.asInstanceOf[js.Any], fontFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def text(txt: String, cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def text(
      txt: String,
      font: Fonts_,
      cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def text(
      txt: String,
      options: Unit,
      cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * @description
      * This `unified-signatures` is disabled because `Fonts` type is too long
      */
    // tslint:disable-next-line: unified-signatures
    inline def text(
      txt: String,
      options: Options,
      cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def textSync(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def textSync(txt: String, font: Fonts_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * @description
      * This `unified-signatures` is disabled because `Fonts` type is too long
      */
    inline def textSync(txt: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
