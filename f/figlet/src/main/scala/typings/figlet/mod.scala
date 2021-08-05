package typings.figlet

import typings.figlet.anon.PartialDefaults
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(txt: String, cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    txt: String,
    font: Fonts_,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    txt: String,
    options: Unit,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  inline def apply(
    txt: String,
    options: Options,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("figlet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(): Defaults_ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Defaults_]
  inline def defaults(opt: PartialDefaults): Defaults_ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt.asInstanceOf[js.Any]).asInstanceOf[Defaults_]
  
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  inline def fonts(cb: js.Function2[/* error */ Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts_]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fonts")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  inline def fontsSync(): js.Array[Fonts_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontsSync")().asInstanceOf[js.Array[Fonts_]]
  
  inline def loadFont(
    font: Fonts_,
    cb: js.Function2[/* error */ Error | Null, /* fontOptions */ js.UndefOr[FontOptions], Unit]
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
      /* error */ Error | Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      /* headerComment */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def text(txt: String, cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def text(
    txt: String,
    font: Fonts_,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def text(
    txt: String,
    options: Unit,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  inline def text(
    txt: String,
    options: Options,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def textSync(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def textSync(txt: String, font: Fonts_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  inline def textSync(txt: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Defaults_ extends StObject {
    
    var font: Fonts_
    
    var fontPath: String
  }
  object Defaults_ {
    
    inline def apply(font: Fonts_, fontPath: String): Defaults_ = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defaults_]
    }
    
    extension [Self <: Defaults_](x: Self) {
      
      inline def setFont(value: Fonts_): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait FittingRules extends StObject {
    
    var hLayout: Double
    
    var hRule1: Boolean
    
    var hRule2: Boolean
    
    var hRule3: Boolean
    
    var hRule4: Boolean
    
    var hRule5: Boolean
    
    var hRule6: Boolean
    
    var vLayout: Double
    
    var vRule1: Boolean
    
    var vRule2: Boolean
    
    var vRule3: Boolean
    
    var vRule4: Boolean
    
    var vRule5: Boolean
  }
  object FittingRules {
    
    inline def apply(
      hLayout: Double,
      hRule1: Boolean,
      hRule2: Boolean,
      hRule3: Boolean,
      hRule4: Boolean,
      hRule5: Boolean,
      hRule6: Boolean,
      vLayout: Double,
      vRule1: Boolean,
      vRule2: Boolean,
      vRule3: Boolean,
      vRule4: Boolean,
      vRule5: Boolean
    ): FittingRules = {
      val __obj = js.Dynamic.literal(hLayout = hLayout.asInstanceOf[js.Any], hRule1 = hRule1.asInstanceOf[js.Any], hRule2 = hRule2.asInstanceOf[js.Any], hRule3 = hRule3.asInstanceOf[js.Any], hRule4 = hRule4.asInstanceOf[js.Any], hRule5 = hRule5.asInstanceOf[js.Any], hRule6 = hRule6.asInstanceOf[js.Any], vLayout = vLayout.asInstanceOf[js.Any], vRule1 = vRule1.asInstanceOf[js.Any], vRule2 = vRule2.asInstanceOf[js.Any], vRule3 = vRule3.asInstanceOf[js.Any], vRule4 = vRule4.asInstanceOf[js.Any], vRule5 = vRule5.asInstanceOf[js.Any])
      __obj.asInstanceOf[FittingRules]
    }
    
    extension [Self <: FittingRules](x: Self) {
      
      inline def setHLayout(value: Double): Self = StObject.set(x, "hLayout", value.asInstanceOf[js.Any])
      
      inline def setHRule1(value: Boolean): Self = StObject.set(x, "hRule1", value.asInstanceOf[js.Any])
      
      inline def setHRule2(value: Boolean): Self = StObject.set(x, "hRule2", value.asInstanceOf[js.Any])
      
      inline def setHRule3(value: Boolean): Self = StObject.set(x, "hRule3", value.asInstanceOf[js.Any])
      
      inline def setHRule4(value: Boolean): Self = StObject.set(x, "hRule4", value.asInstanceOf[js.Any])
      
      inline def setHRule5(value: Boolean): Self = StObject.set(x, "hRule5", value.asInstanceOf[js.Any])
      
      inline def setHRule6(value: Boolean): Self = StObject.set(x, "hRule6", value.asInstanceOf[js.Any])
      
      inline def setVLayout(value: Double): Self = StObject.set(x, "vLayout", value.asInstanceOf[js.Any])
      
      inline def setVRule1(value: Boolean): Self = StObject.set(x, "vRule1", value.asInstanceOf[js.Any])
      
      inline def setVRule2(value: Boolean): Self = StObject.set(x, "vRule2", value.asInstanceOf[js.Any])
      
      inline def setVRule3(value: Boolean): Self = StObject.set(x, "vRule3", value.asInstanceOf[js.Any])
      
      inline def setVRule4(value: Boolean): Self = StObject.set(x, "vRule4", value.asInstanceOf[js.Any])
      
      inline def setVRule5(value: Boolean): Self = StObject.set(x, "vRule5", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontOptions extends StObject {
    
    var baseline: Double
    
    var codeTagCount: Double | Null
    
    var fittingRules: FittingRules
    
    var fullLayout: Double | Null
    
    var hardBlank: String
    
    var height: Double
    
    var maxLength: Double
    
    var numCommentLines: Double
    
    var oldLayout: Double
    
    var printDirection: PrintDirection
  }
  object FontOptions {
    
    inline def apply(
      baseline: Double,
      fittingRules: FittingRules,
      hardBlank: String,
      height: Double,
      maxLength: Double,
      numCommentLines: Double,
      oldLayout: Double,
      printDirection: PrintDirection
    ): FontOptions = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], fittingRules = fittingRules.asInstanceOf[js.Any], hardBlank = hardBlank.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], numCommentLines = numCommentLines.asInstanceOf[js.Any], oldLayout = oldLayout.asInstanceOf[js.Any], printDirection = printDirection.asInstanceOf[js.Any], codeTagCount = null, fullLayout = null)
      __obj.asInstanceOf[FontOptions]
    }
    
    extension [Self <: FontOptions](x: Self) {
      
      inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setCodeTagCount(value: Double): Self = StObject.set(x, "codeTagCount", value.asInstanceOf[js.Any])
      
      inline def setCodeTagCountNull: Self = StObject.set(x, "codeTagCount", null)
      
      inline def setFittingRules(value: FittingRules): Self = StObject.set(x, "fittingRules", value.asInstanceOf[js.Any])
      
      inline def setFullLayout(value: Double): Self = StObject.set(x, "fullLayout", value.asInstanceOf[js.Any])
      
      inline def setFullLayoutNull: Self = StObject.set(x, "fullLayout", null)
      
      inline def setHardBlank(value: String): Self = StObject.set(x, "hardBlank", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setNumCommentLines(value: Double): Self = StObject.set(x, "numCommentLines", value.asInstanceOf[js.Any])
      
      inline def setOldLayout(value: Double): Self = StObject.set(x, "oldLayout", value.asInstanceOf[js.Any])
      
      inline def setPrintDirection(value: PrintDirection): Self = StObject.set(x, "printDirection", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.figlet.figletStrings.`1Row`
    - typings.figlet.figletStrings.`3-D`
    - typings.figlet.figletStrings.`3D Diagonal`
    - typings.figlet.figletStrings.`3D-ASCII`
    - typings.figlet.figletStrings.`3x5`
    - typings.figlet.figletStrings.`4Max`
    - typings.figlet.figletStrings.`5 Line Oblique`
    - typings.figlet.figletStrings.`AMC 3 Line`
    - typings.figlet.figletStrings.`AMC 3 Liv1`
    - typings.figlet.figletStrings.`AMC AAA01`
    - typings.figlet.figletStrings.`AMC Neko`
    - typings.figlet.figletStrings.`AMC Razor`
    - typings.figlet.figletStrings.`AMC Razor2`
    - typings.figlet.figletStrings.`AMC Slash`
    - typings.figlet.figletStrings.`AMC Slider`
    - typings.figlet.figletStrings.`AMC Thin`
    - typings.figlet.figletStrings.`AMC Tubes`
    - typings.figlet.figletStrings.`AMC Untitled`
    - typings.figlet.figletStrings.`ANSI Shadow`
    - typings.figlet.figletStrings.`ASCII New Roman`
    - typings.figlet.figletStrings.Acrobatic
    - typings.figlet.figletStrings.Alligator
    - typings.figlet.figletStrings.Alligator2
    - typings.figlet.figletStrings.Alpha
    - typings.figlet.figletStrings.Alphabet
    - typings.figlet.figletStrings.Arrows
    - typings.figlet.figletStrings.Avatar
    - typings.figlet.figletStrings.B1FF
    - typings.figlet.figletStrings.Banner
    - typings.figlet.figletStrings.`Banner3-D`
    - typings.figlet.figletStrings.Banner3
    - typings.figlet.figletStrings.Banner4
    - typings.figlet.figletStrings.Barbwire
    - typings.figlet.figletStrings.Basic
    - typings.figlet.figletStrings.Bear
    - typings.figlet.figletStrings.Bell
    - typings.figlet.figletStrings.Benjamin
    - typings.figlet.figletStrings.`Big Chief`
    - typings.figlet.figletStrings.`Big Money-ne`
    - typings.figlet.figletStrings.`Big Money-nw`
    - typings.figlet.figletStrings.`Big Money-se`
    - typings.figlet.figletStrings.`Big Money-sw`
    - typings.figlet.figletStrings.Big
    - typings.figlet.figletStrings.Bigfig
    - typings.figlet.figletStrings.Binary
    - typings.figlet.figletStrings.Block
    - typings.figlet.figletStrings.Blocks
    - typings.figlet.figletStrings.Bloody
    - typings.figlet.figletStrings.Bolger
    - typings.figlet.figletStrings.Braced
    - typings.figlet.figletStrings.Bright
    - typings.figlet.figletStrings.`Broadway KB`
    - typings.figlet.figletStrings.Broadway
    - typings.figlet.figletStrings.Bubble
    - typings.figlet.figletStrings.Bulbhead
    - typings.figlet.figletStrings.Caligraphy
    - typings.figlet.figletStrings.Caligraphy2
    - typings.figlet.figletStrings.`Calvin S`
    - typings.figlet.figletStrings.Cards
    - typings.figlet.figletStrings.Catwalk
    - typings.figlet.figletStrings.Chiseled
    - typings.figlet.figletStrings.Chunky
    - typings.figlet.figletStrings.Coinstak
    - typings.figlet.figletStrings.Cola
    - typings.figlet.figletStrings.Colossal
    - typings.figlet.figletStrings.Computer
    - typings.figlet.figletStrings.Contessa
    - typings.figlet.figletStrings.Contrast
    - typings.figlet.figletStrings.Cosmike
    - typings.figlet.figletStrings.Crawford
    - typings.figlet.figletStrings.Crawford2
    - typings.figlet.figletStrings.Crazy
    - typings.figlet.figletStrings.Cricket
    - typings.figlet.figletStrings.Cursive
    - typings.figlet.figletStrings.Cyberlarge
    - typings.figlet.figletStrings.Cybermedium
    - typings.figlet.figletStrings.Cybersmall
    - typings.figlet.figletStrings.Cygnet
    - typings.figlet.figletStrings.DANC4
    - typings.figlet.figletStrings.`DOS Rebel`
    - typings.figlet.figletStrings.DWhistled
    - typings.figlet.figletStrings.`Dancing Font`
    - typings.figlet.figletStrings.Decimal
    - typings.figlet.figletStrings.`Def Leppard`
    - typings.figlet.figletStrings.`Delta Corps Priest 1`
    - typings.figlet.figletStrings.Diamond
    - typings.figlet.figletStrings.`Diet Cola`
    - typings.figlet.figletStrings.Digital
    - typings.figlet.figletStrings.Doh
    - typings.figlet.figletStrings.Doom
    - typings.figlet.figletStrings.`Dot Matrix`
    - typings.figlet.figletStrings.`Double Shorts`
    - typings.figlet.figletStrings.Double
    - typings.figlet.figletStrings.`Dr Pepper`
    - typings.figlet.figletStrings.`Efti Chess`
    - typings.figlet.figletStrings.`Efti Font`
    - typings.figlet.figletStrings.`Efti Italic`
    - typings.figlet.figletStrings.`Efti Piti`
    - typings.figlet.figletStrings.`Efti Robot`
    - typings.figlet.figletStrings.`Efti Wall`
    - typings.figlet.figletStrings.`Efti Water`
    - typings.figlet.figletStrings.Electronic
    - typings.figlet.figletStrings.Elite
    - typings.figlet.figletStrings.Epic
    - typings.figlet.figletStrings.Fender
    - typings.figlet.figletStrings.Filter
    - typings.figlet.figletStrings.`Fire Font-k`
    - typings.figlet.figletStrings.`Fire Font-s`
    - typings.figlet.figletStrings.Flipped
    - typings.figlet.figletStrings.`Flower Power`
    - typings.figlet.figletStrings.`Four Tops`
    - typings.figlet.figletStrings.Fraktur
    - typings.figlet.figletStrings.`Fun Face`
    - typings.figlet.figletStrings.`Fun Faces`
    - typings.figlet.figletStrings.Fuzzy
    - typings.figlet.figletStrings.Georgi16
    - typings.figlet.figletStrings.Georgia11
    - typings.figlet.figletStrings.Ghost
    - typings.figlet.figletStrings.Ghoulish
    - typings.figlet.figletStrings.Glenyn
    - typings.figlet.figletStrings.Goofy
    - typings.figlet.figletStrings.Gothic
    - typings.figlet.figletStrings.Graceful
    - typings.figlet.figletStrings.Gradient
    - typings.figlet.figletStrings.Graffiti
    - typings.figlet.figletStrings.Greek
    - typings.figlet.figletStrings.`Heart Left`
    - typings.figlet.figletStrings.`Heart Right`
    - typings.figlet.figletStrings.`Henry 3D`
    - typings.figlet.figletStrings.Hex
    - typings.figlet.figletStrings.Hieroglyphs
    - typings.figlet.figletStrings.Hollywood
    - typings.figlet.figletStrings.`Horizontal Left`
    - typings.figlet.figletStrings.`Horizontal Right`
    - typings.figlet.figletStrings.`ICL-1900`
    - typings.figlet.figletStrings.Impossible
    - typings.figlet.figletStrings.Invita
    - typings.figlet.figletStrings.Isometric1
    - typings.figlet.figletStrings.Isometric2
    - typings.figlet.figletStrings.Isometric3
    - typings.figlet.figletStrings.Isometric4
    - typings.figlet.figletStrings.Italic
    - typings.figlet.figletStrings.Ivrit
    - typings.figlet.figletStrings.`JS Block Letters`
    - typings.figlet.figletStrings.`JS Bracket Letters`
    - typings.figlet.figletStrings.`JS Capital Curves`
    - typings.figlet.figletStrings.`JS Cursive`
    - typings.figlet.figletStrings.`JS Stick Letters`
    - typings.figlet.figletStrings.Jacky
    - typings.figlet.figletStrings.Jazmine
    - typings.figlet.figletStrings.Jerusalem
    - typings.figlet.figletStrings.Katakana
    - typings.figlet.figletStrings.Kban
    - typings.figlet.figletStrings.Keyboard
    - typings.figlet.figletStrings.Knob
    - typings.figlet.figletStrings.`Konto Slant`
    - typings.figlet.figletStrings.Konto
    - typings.figlet.figletStrings.LCD
    - typings.figlet.figletStrings.`Larry 3D 2`
    - typings.figlet.figletStrings.`Larry 3D`
    - typings.figlet.figletStrings.Lean
    - typings.figlet.figletStrings.Letters
    - typings.figlet.figletStrings.`Lil Devil`
    - typings.figlet.figletStrings.`Line Blocks`
    - typings.figlet.figletStrings.Linux
    - typings.figlet.figletStrings.Lockergnome
    - typings.figlet.figletStrings.Madrid
    - typings.figlet.figletStrings.Marquee
    - typings.figlet.figletStrings.Maxfour
    - typings.figlet.figletStrings.Merlin1
    - typings.figlet.figletStrings.Merlin2
    - typings.figlet.figletStrings.Mike
    - typings.figlet.figletStrings.Mini
    - typings.figlet.figletStrings.Mirror
    - typings.figlet.figletStrings.Mnemonic
    - typings.figlet.figletStrings.Modular
    - typings.figlet.figletStrings.Morse
    - typings.figlet.figletStrings.Morse2
    - typings.figlet.figletStrings.Moscow
    - typings.figlet.figletStrings.Mshebrew210
    - typings.figlet.figletStrings.Muzzle
    - typings.figlet.figletStrings.NScript
    - typings.figlet.figletStrings.`NT Greek`
    - typings.figlet.figletStrings.`NV Script`
    - typings.figlet.figletStrings.`Nancyj-Fancy`
    - typings.figlet.figletStrings.`Nancyj-Improved`
    - typings.figlet.figletStrings.`Nancyj-Underlined`
    - typings.figlet.figletStrings.Nancyj
    - typings.figlet.figletStrings.Nipples
    - typings.figlet.figletStrings.O8
    - typings.figlet.figletStrings.OS2
    - typings.figlet.figletStrings.Octal
    - typings.figlet.figletStrings.Ogre
    - typings.figlet.figletStrings.`Old Banner`
    - typings.figlet.figletStrings.`PatorjkApostrophes Cheese`
    - typings.figlet.figletStrings.`Patorjk-HeX`
    - typings.figlet.figletStrings.Pawp
    - typings.figlet.figletStrings.`Peaks Slant`
    - typings.figlet.figletStrings.Peaks
    - typings.figlet.figletStrings.Pebbles
    - typings.figlet.figletStrings.Pepper
    - typings.figlet.figletStrings.Poison
    - typings.figlet.figletStrings.Puffy
    - typings.figlet.figletStrings.Puzzle
    - typings.figlet.figletStrings.Pyramid
    - typings.figlet.figletStrings.Rammstein
    - typings.figlet.figletStrings.Rectangles
    - typings.figlet.figletStrings.`Red Phoenix`
    - typings.figlet.figletStrings.Relief
    - typings.figlet.figletStrings.Relief2
    - typings.figlet.figletStrings.Reverse
    - typings.figlet.figletStrings.Roman
    - typings.figlet.figletStrings.Rot13
    - typings.figlet.figletStrings.Rotated
    - typings.figlet.figletStrings.Rounded
    - typings.figlet.figletStrings.`Rowan Cap`
    - typings.figlet.figletStrings.Rozzo
    - typings.figlet.figletStrings.Runic
    - typings.figlet.figletStrings.Runyc
    - typings.figlet.figletStrings.`S Blood`
    - typings.figlet.figletStrings.`SL Script`
    - typings.figlet.figletStrings.`Santa Clara`
    - typings.figlet.figletStrings.Script
    - typings.figlet.figletStrings.Serifcap
    - typings.figlet.figletStrings.Shadow
    - typings.figlet.figletStrings.Shimrod
    - typings.figlet.figletStrings.Short
    - typings.figlet.figletStrings.`Slant Relief`
    - typings.figlet.figletStrings.Slant
    - typings.figlet.figletStrings.Slide
    - typings.figlet.figletStrings.`Small Caps`
    - typings.figlet.figletStrings.`Small Isometric1`
    - typings.figlet.figletStrings.`Small Keyboard`
    - typings.figlet.figletStrings.`Small Poison`
    - typings.figlet.figletStrings.`Small Script`
    - typings.figlet.figletStrings.`Small Shadow`
    - typings.figlet.figletStrings.`Small Slant`
    - typings.figlet.figletStrings.`Small Tengwar`
    - typings.figlet.figletStrings.Small
    - typings.figlet.figletStrings.Soft
    - typings.figlet.figletStrings.Speed
    - typings.figlet.figletStrings.Spliff
    - typings.figlet.figletStrings.Stacey
    - typings.figlet.figletStrings.Stampate
    - typings.figlet.figletStrings.Stampatello
    - typings.figlet.figletStrings.Standard
    - typings.figlet.figletStrings.`Star Strips`
    - typings.figlet.figletStrings.`Star Wars`
    - typings.figlet.figletStrings.Stellar
    - typings.figlet.figletStrings.Stforek
    - typings.figlet.figletStrings.`Stick Letters`
    - typings.figlet.figletStrings.Stop
    - typings.figlet.figletStrings.Straight
    - typings.figlet.figletStrings.`Stronger Than All`
    - typings.figlet.figletStrings.`Sub-Zero`
    - typings.figlet.figletStrings.`Swamp Land`
    - typings.figlet.figletStrings.Swan
    - typings.figlet.figletStrings.Sweet
    - typings.figlet.figletStrings.THIS
    - typings.figlet.figletStrings.Tanja
    - typings.figlet.figletStrings.Tengwar
    - typings.figlet.figletStrings.Term
    - typings.figlet.figletStrings.Test1
    - typings.figlet.figletStrings.`The Edge`
    - typings.figlet.figletStrings.Thick
    - typings.figlet.figletStrings.Thin
    - typings.figlet.figletStrings.Thorned
    - typings.figlet.figletStrings.`Three Point`
    - typings.figlet.figletStrings.`Ticks Slant`
    - typings.figlet.figletStrings.Ticks
    - typings.figlet.figletStrings.Tiles
    - typings.figlet.figletStrings.`Tinker-Toy`
    - typings.figlet.figletStrings.Tombstone
    - typings.figlet.figletStrings.Train
    - typings.figlet.figletStrings.Trek
    - typings.figlet.figletStrings.Tsalagi
    - typings.figlet.figletStrings.Tubular
    - typings.figlet.figletStrings.Twisted
    - typings.figlet.figletStrings.`Two Point`
    - typings.figlet.figletStrings.`USA Flag`
    - typings.figlet.figletStrings.Univers
    - typings.figlet.figletStrings.Varsity
    - typings.figlet.figletStrings.Wavy
    - typings.figlet.figletStrings.Weird
    - typings.figlet.figletStrings.`Wet Letter`
    - typings.figlet.figletStrings.Whimsy
    - typings.figlet.figletStrings.Wow
  */
  trait Fonts_ extends StObject
  object Fonts_ {
    
    inline def `1Row`: typings.figlet.figletStrings.`1Row` = "1Row".asInstanceOf[typings.figlet.figletStrings.`1Row`]
    
    inline def `3-D`: typings.figlet.figletStrings.`3-D` = "3-D".asInstanceOf[typings.figlet.figletStrings.`3-D`]
    
    inline def `3D Diagonal`: typings.figlet.figletStrings.`3D Diagonal` = ("3D Diagonal").asInstanceOf[typings.figlet.figletStrings.`3D Diagonal`]
    
    inline def `3D-ASCII`: typings.figlet.figletStrings.`3D-ASCII` = "3D-ASCII".asInstanceOf[typings.figlet.figletStrings.`3D-ASCII`]
    
    inline def `3x5`: typings.figlet.figletStrings.`3x5` = "3x5".asInstanceOf[typings.figlet.figletStrings.`3x5`]
    
    inline def `4Max`: typings.figlet.figletStrings.`4Max` = "4Max".asInstanceOf[typings.figlet.figletStrings.`4Max`]
    
    inline def `5 Line Oblique`: typings.figlet.figletStrings.`5 Line Oblique` = ("5 Line Oblique").asInstanceOf[typings.figlet.figletStrings.`5 Line Oblique`]
    
    inline def `AMC 3 Line`: typings.figlet.figletStrings.`AMC 3 Line` = ("AMC 3 Line").asInstanceOf[typings.figlet.figletStrings.`AMC 3 Line`]
    
    inline def `AMC 3 Liv1`: typings.figlet.figletStrings.`AMC 3 Liv1` = ("AMC 3 Liv1").asInstanceOf[typings.figlet.figletStrings.`AMC 3 Liv1`]
    
    inline def `AMC AAA01`: typings.figlet.figletStrings.`AMC AAA01` = ("AMC AAA01").asInstanceOf[typings.figlet.figletStrings.`AMC AAA01`]
    
    inline def `AMC Neko`: typings.figlet.figletStrings.`AMC Neko` = ("AMC Neko").asInstanceOf[typings.figlet.figletStrings.`AMC Neko`]
    
    inline def `AMC Razor`: typings.figlet.figletStrings.`AMC Razor` = ("AMC Razor").asInstanceOf[typings.figlet.figletStrings.`AMC Razor`]
    
    inline def `AMC Razor2`: typings.figlet.figletStrings.`AMC Razor2` = ("AMC Razor2").asInstanceOf[typings.figlet.figletStrings.`AMC Razor2`]
    
    inline def `AMC Slash`: typings.figlet.figletStrings.`AMC Slash` = ("AMC Slash").asInstanceOf[typings.figlet.figletStrings.`AMC Slash`]
    
    inline def `AMC Slider`: typings.figlet.figletStrings.`AMC Slider` = ("AMC Slider").asInstanceOf[typings.figlet.figletStrings.`AMC Slider`]
    
    inline def `AMC Thin`: typings.figlet.figletStrings.`AMC Thin` = ("AMC Thin").asInstanceOf[typings.figlet.figletStrings.`AMC Thin`]
    
    inline def `AMC Tubes`: typings.figlet.figletStrings.`AMC Tubes` = ("AMC Tubes").asInstanceOf[typings.figlet.figletStrings.`AMC Tubes`]
    
    inline def `AMC Untitled`: typings.figlet.figletStrings.`AMC Untitled` = ("AMC Untitled").asInstanceOf[typings.figlet.figletStrings.`AMC Untitled`]
    
    inline def `ANSI Shadow`: typings.figlet.figletStrings.`ANSI Shadow` = ("ANSI Shadow").asInstanceOf[typings.figlet.figletStrings.`ANSI Shadow`]
    
    inline def `ASCII New Roman`: typings.figlet.figletStrings.`ASCII New Roman` = ("ASCII New Roman").asInstanceOf[typings.figlet.figletStrings.`ASCII New Roman`]
    
    inline def Acrobatic: typings.figlet.figletStrings.Acrobatic = "Acrobatic".asInstanceOf[typings.figlet.figletStrings.Acrobatic]
    
    inline def Alligator: typings.figlet.figletStrings.Alligator = "Alligator".asInstanceOf[typings.figlet.figletStrings.Alligator]
    
    inline def Alligator2: typings.figlet.figletStrings.Alligator2 = "Alligator2".asInstanceOf[typings.figlet.figletStrings.Alligator2]
    
    inline def Alpha: typings.figlet.figletStrings.Alpha = "Alpha".asInstanceOf[typings.figlet.figletStrings.Alpha]
    
    inline def Alphabet: typings.figlet.figletStrings.Alphabet = "Alphabet".asInstanceOf[typings.figlet.figletStrings.Alphabet]
    
    inline def Arrows: typings.figlet.figletStrings.Arrows = "Arrows".asInstanceOf[typings.figlet.figletStrings.Arrows]
    
    inline def Avatar: typings.figlet.figletStrings.Avatar = "Avatar".asInstanceOf[typings.figlet.figletStrings.Avatar]
    
    inline def B1FF: typings.figlet.figletStrings.B1FF = "B1FF".asInstanceOf[typings.figlet.figletStrings.B1FF]
    
    inline def Banner: typings.figlet.figletStrings.Banner = "Banner".asInstanceOf[typings.figlet.figletStrings.Banner]
    
    inline def Banner3: typings.figlet.figletStrings.Banner3 = "Banner3".asInstanceOf[typings.figlet.figletStrings.Banner3]
    
    inline def `Banner3-D`: typings.figlet.figletStrings.`Banner3-D` = "Banner3-D".asInstanceOf[typings.figlet.figletStrings.`Banner3-D`]
    
    inline def Banner4: typings.figlet.figletStrings.Banner4 = "Banner4".asInstanceOf[typings.figlet.figletStrings.Banner4]
    
    inline def Barbwire: typings.figlet.figletStrings.Barbwire = "Barbwire".asInstanceOf[typings.figlet.figletStrings.Barbwire]
    
    inline def Basic: typings.figlet.figletStrings.Basic = "Basic".asInstanceOf[typings.figlet.figletStrings.Basic]
    
    inline def Bear: typings.figlet.figletStrings.Bear = "Bear".asInstanceOf[typings.figlet.figletStrings.Bear]
    
    inline def Bell: typings.figlet.figletStrings.Bell = "Bell".asInstanceOf[typings.figlet.figletStrings.Bell]
    
    inline def Benjamin: typings.figlet.figletStrings.Benjamin = "Benjamin".asInstanceOf[typings.figlet.figletStrings.Benjamin]
    
    inline def Big: typings.figlet.figletStrings.Big = "Big".asInstanceOf[typings.figlet.figletStrings.Big]
    
    inline def `Big Chief`: typings.figlet.figletStrings.`Big Chief` = ("Big Chief").asInstanceOf[typings.figlet.figletStrings.`Big Chief`]
    
    inline def `Big Money-ne`: typings.figlet.figletStrings.`Big Money-ne` = ("Big Money-ne").asInstanceOf[typings.figlet.figletStrings.`Big Money-ne`]
    
    inline def `Big Money-nw`: typings.figlet.figletStrings.`Big Money-nw` = ("Big Money-nw").asInstanceOf[typings.figlet.figletStrings.`Big Money-nw`]
    
    inline def `Big Money-se`: typings.figlet.figletStrings.`Big Money-se` = ("Big Money-se").asInstanceOf[typings.figlet.figletStrings.`Big Money-se`]
    
    inline def `Big Money-sw`: typings.figlet.figletStrings.`Big Money-sw` = ("Big Money-sw").asInstanceOf[typings.figlet.figletStrings.`Big Money-sw`]
    
    inline def Bigfig: typings.figlet.figletStrings.Bigfig = "Bigfig".asInstanceOf[typings.figlet.figletStrings.Bigfig]
    
    inline def Binary: typings.figlet.figletStrings.Binary = "Binary".asInstanceOf[typings.figlet.figletStrings.Binary]
    
    inline def Block: typings.figlet.figletStrings.Block = "Block".asInstanceOf[typings.figlet.figletStrings.Block]
    
    inline def Blocks: typings.figlet.figletStrings.Blocks = "Blocks".asInstanceOf[typings.figlet.figletStrings.Blocks]
    
    inline def Bloody: typings.figlet.figletStrings.Bloody = "Bloody".asInstanceOf[typings.figlet.figletStrings.Bloody]
    
    inline def Bolger: typings.figlet.figletStrings.Bolger = "Bolger".asInstanceOf[typings.figlet.figletStrings.Bolger]
    
    inline def Braced: typings.figlet.figletStrings.Braced = "Braced".asInstanceOf[typings.figlet.figletStrings.Braced]
    
    inline def Bright: typings.figlet.figletStrings.Bright = "Bright".asInstanceOf[typings.figlet.figletStrings.Bright]
    
    inline def Broadway: typings.figlet.figletStrings.Broadway = "Broadway".asInstanceOf[typings.figlet.figletStrings.Broadway]
    
    inline def `Broadway KB`: typings.figlet.figletStrings.`Broadway KB` = ("Broadway KB").asInstanceOf[typings.figlet.figletStrings.`Broadway KB`]
    
    inline def Bubble: typings.figlet.figletStrings.Bubble = "Bubble".asInstanceOf[typings.figlet.figletStrings.Bubble]
    
    inline def Bulbhead: typings.figlet.figletStrings.Bulbhead = "Bulbhead".asInstanceOf[typings.figlet.figletStrings.Bulbhead]
    
    inline def Caligraphy: typings.figlet.figletStrings.Caligraphy = "Caligraphy".asInstanceOf[typings.figlet.figletStrings.Caligraphy]
    
    inline def Caligraphy2: typings.figlet.figletStrings.Caligraphy2 = "Caligraphy2".asInstanceOf[typings.figlet.figletStrings.Caligraphy2]
    
    inline def `Calvin S`: typings.figlet.figletStrings.`Calvin S` = ("Calvin S").asInstanceOf[typings.figlet.figletStrings.`Calvin S`]
    
    inline def Cards: typings.figlet.figletStrings.Cards = "Cards".asInstanceOf[typings.figlet.figletStrings.Cards]
    
    inline def Catwalk: typings.figlet.figletStrings.Catwalk = "Catwalk".asInstanceOf[typings.figlet.figletStrings.Catwalk]
    
    inline def Chiseled: typings.figlet.figletStrings.Chiseled = "Chiseled".asInstanceOf[typings.figlet.figletStrings.Chiseled]
    
    inline def Chunky: typings.figlet.figletStrings.Chunky = "Chunky".asInstanceOf[typings.figlet.figletStrings.Chunky]
    
    inline def Coinstak: typings.figlet.figletStrings.Coinstak = "Coinstak".asInstanceOf[typings.figlet.figletStrings.Coinstak]
    
    inline def Cola: typings.figlet.figletStrings.Cola = "Cola".asInstanceOf[typings.figlet.figletStrings.Cola]
    
    inline def Colossal: typings.figlet.figletStrings.Colossal = "Colossal".asInstanceOf[typings.figlet.figletStrings.Colossal]
    
    inline def Computer: typings.figlet.figletStrings.Computer = "Computer".asInstanceOf[typings.figlet.figletStrings.Computer]
    
    inline def Contessa: typings.figlet.figletStrings.Contessa = "Contessa".asInstanceOf[typings.figlet.figletStrings.Contessa]
    
    inline def Contrast: typings.figlet.figletStrings.Contrast = "Contrast".asInstanceOf[typings.figlet.figletStrings.Contrast]
    
    inline def Cosmike: typings.figlet.figletStrings.Cosmike = "Cosmike".asInstanceOf[typings.figlet.figletStrings.Cosmike]
    
    inline def Crawford: typings.figlet.figletStrings.Crawford = "Crawford".asInstanceOf[typings.figlet.figletStrings.Crawford]
    
    inline def Crawford2: typings.figlet.figletStrings.Crawford2 = "Crawford2".asInstanceOf[typings.figlet.figletStrings.Crawford2]
    
    inline def Crazy: typings.figlet.figletStrings.Crazy = "Crazy".asInstanceOf[typings.figlet.figletStrings.Crazy]
    
    inline def Cricket: typings.figlet.figletStrings.Cricket = "Cricket".asInstanceOf[typings.figlet.figletStrings.Cricket]
    
    inline def Cursive: typings.figlet.figletStrings.Cursive = "Cursive".asInstanceOf[typings.figlet.figletStrings.Cursive]
    
    inline def Cyberlarge: typings.figlet.figletStrings.Cyberlarge = "Cyberlarge".asInstanceOf[typings.figlet.figletStrings.Cyberlarge]
    
    inline def Cybermedium: typings.figlet.figletStrings.Cybermedium = "Cybermedium".asInstanceOf[typings.figlet.figletStrings.Cybermedium]
    
    inline def Cybersmall: typings.figlet.figletStrings.Cybersmall = "Cybersmall".asInstanceOf[typings.figlet.figletStrings.Cybersmall]
    
    inline def Cygnet: typings.figlet.figletStrings.Cygnet = "Cygnet".asInstanceOf[typings.figlet.figletStrings.Cygnet]
    
    inline def DANC4: typings.figlet.figletStrings.DANC4 = "DANC4".asInstanceOf[typings.figlet.figletStrings.DANC4]
    
    inline def `DOS Rebel`: typings.figlet.figletStrings.`DOS Rebel` = ("DOS Rebel").asInstanceOf[typings.figlet.figletStrings.`DOS Rebel`]
    
    inline def DWhistled: typings.figlet.figletStrings.DWhistled = "DWhistled".asInstanceOf[typings.figlet.figletStrings.DWhistled]
    
    inline def `Dancing Font`: typings.figlet.figletStrings.`Dancing Font` = ("Dancing Font").asInstanceOf[typings.figlet.figletStrings.`Dancing Font`]
    
    inline def Decimal: typings.figlet.figletStrings.Decimal = "Decimal".asInstanceOf[typings.figlet.figletStrings.Decimal]
    
    inline def `Def Leppard`: typings.figlet.figletStrings.`Def Leppard` = ("Def Leppard").asInstanceOf[typings.figlet.figletStrings.`Def Leppard`]
    
    inline def `Delta Corps Priest 1`: typings.figlet.figletStrings.`Delta Corps Priest 1` = ("Delta Corps Priest 1").asInstanceOf[typings.figlet.figletStrings.`Delta Corps Priest 1`]
    
    inline def Diamond: typings.figlet.figletStrings.Diamond = "Diamond".asInstanceOf[typings.figlet.figletStrings.Diamond]
    
    inline def `Diet Cola`: typings.figlet.figletStrings.`Diet Cola` = ("Diet Cola").asInstanceOf[typings.figlet.figletStrings.`Diet Cola`]
    
    inline def Digital: typings.figlet.figletStrings.Digital = "Digital".asInstanceOf[typings.figlet.figletStrings.Digital]
    
    inline def Doh: typings.figlet.figletStrings.Doh = "Doh".asInstanceOf[typings.figlet.figletStrings.Doh]
    
    inline def Doom: typings.figlet.figletStrings.Doom = "Doom".asInstanceOf[typings.figlet.figletStrings.Doom]
    
    inline def `Dot Matrix`: typings.figlet.figletStrings.`Dot Matrix` = ("Dot Matrix").asInstanceOf[typings.figlet.figletStrings.`Dot Matrix`]
    
    inline def Double: typings.figlet.figletStrings.Double = "Double".asInstanceOf[typings.figlet.figletStrings.Double]
    
    inline def `Double Shorts`: typings.figlet.figletStrings.`Double Shorts` = ("Double Shorts").asInstanceOf[typings.figlet.figletStrings.`Double Shorts`]
    
    inline def `Dr Pepper`: typings.figlet.figletStrings.`Dr Pepper` = ("Dr Pepper").asInstanceOf[typings.figlet.figletStrings.`Dr Pepper`]
    
    inline def `Efti Chess`: typings.figlet.figletStrings.`Efti Chess` = ("Efti Chess").asInstanceOf[typings.figlet.figletStrings.`Efti Chess`]
    
    inline def `Efti Font`: typings.figlet.figletStrings.`Efti Font` = ("Efti Font").asInstanceOf[typings.figlet.figletStrings.`Efti Font`]
    
    inline def `Efti Italic`: typings.figlet.figletStrings.`Efti Italic` = ("Efti Italic").asInstanceOf[typings.figlet.figletStrings.`Efti Italic`]
    
    inline def `Efti Piti`: typings.figlet.figletStrings.`Efti Piti` = ("Efti Piti").asInstanceOf[typings.figlet.figletStrings.`Efti Piti`]
    
    inline def `Efti Robot`: typings.figlet.figletStrings.`Efti Robot` = ("Efti Robot").asInstanceOf[typings.figlet.figletStrings.`Efti Robot`]
    
    inline def `Efti Wall`: typings.figlet.figletStrings.`Efti Wall` = ("Efti Wall").asInstanceOf[typings.figlet.figletStrings.`Efti Wall`]
    
    inline def `Efti Water`: typings.figlet.figletStrings.`Efti Water` = ("Efti Water").asInstanceOf[typings.figlet.figletStrings.`Efti Water`]
    
    inline def Electronic: typings.figlet.figletStrings.Electronic = "Electronic".asInstanceOf[typings.figlet.figletStrings.Electronic]
    
    inline def Elite: typings.figlet.figletStrings.Elite = "Elite".asInstanceOf[typings.figlet.figletStrings.Elite]
    
    inline def Epic: typings.figlet.figletStrings.Epic = "Epic".asInstanceOf[typings.figlet.figletStrings.Epic]
    
    inline def Fender: typings.figlet.figletStrings.Fender = "Fender".asInstanceOf[typings.figlet.figletStrings.Fender]
    
    inline def Filter: typings.figlet.figletStrings.Filter = "Filter".asInstanceOf[typings.figlet.figletStrings.Filter]
    
    inline def `Fire Font-k`: typings.figlet.figletStrings.`Fire Font-k` = ("Fire Font-k").asInstanceOf[typings.figlet.figletStrings.`Fire Font-k`]
    
    inline def `Fire Font-s`: typings.figlet.figletStrings.`Fire Font-s` = ("Fire Font-s").asInstanceOf[typings.figlet.figletStrings.`Fire Font-s`]
    
    inline def Flipped: typings.figlet.figletStrings.Flipped = "Flipped".asInstanceOf[typings.figlet.figletStrings.Flipped]
    
    inline def `Flower Power`: typings.figlet.figletStrings.`Flower Power` = ("Flower Power").asInstanceOf[typings.figlet.figletStrings.`Flower Power`]
    
    inline def `Four Tops`: typings.figlet.figletStrings.`Four Tops` = ("Four Tops").asInstanceOf[typings.figlet.figletStrings.`Four Tops`]
    
    inline def Fraktur: typings.figlet.figletStrings.Fraktur = "Fraktur".asInstanceOf[typings.figlet.figletStrings.Fraktur]
    
    inline def `Fun Face`: typings.figlet.figletStrings.`Fun Face` = ("Fun Face").asInstanceOf[typings.figlet.figletStrings.`Fun Face`]
    
    inline def `Fun Faces`: typings.figlet.figletStrings.`Fun Faces` = ("Fun Faces").asInstanceOf[typings.figlet.figletStrings.`Fun Faces`]
    
    inline def Fuzzy: typings.figlet.figletStrings.Fuzzy = "Fuzzy".asInstanceOf[typings.figlet.figletStrings.Fuzzy]
    
    inline def Georgi16: typings.figlet.figletStrings.Georgi16 = "Georgi16".asInstanceOf[typings.figlet.figletStrings.Georgi16]
    
    inline def Georgia11: typings.figlet.figletStrings.Georgia11 = "Georgia11".asInstanceOf[typings.figlet.figletStrings.Georgia11]
    
    inline def Ghost: typings.figlet.figletStrings.Ghost = "Ghost".asInstanceOf[typings.figlet.figletStrings.Ghost]
    
    inline def Ghoulish: typings.figlet.figletStrings.Ghoulish = "Ghoulish".asInstanceOf[typings.figlet.figletStrings.Ghoulish]
    
    inline def Glenyn: typings.figlet.figletStrings.Glenyn = "Glenyn".asInstanceOf[typings.figlet.figletStrings.Glenyn]
    
    inline def Goofy: typings.figlet.figletStrings.Goofy = "Goofy".asInstanceOf[typings.figlet.figletStrings.Goofy]
    
    inline def Gothic: typings.figlet.figletStrings.Gothic = "Gothic".asInstanceOf[typings.figlet.figletStrings.Gothic]
    
    inline def Graceful: typings.figlet.figletStrings.Graceful = "Graceful".asInstanceOf[typings.figlet.figletStrings.Graceful]
    
    inline def Gradient: typings.figlet.figletStrings.Gradient = "Gradient".asInstanceOf[typings.figlet.figletStrings.Gradient]
    
    inline def Graffiti: typings.figlet.figletStrings.Graffiti = "Graffiti".asInstanceOf[typings.figlet.figletStrings.Graffiti]
    
    inline def Greek: typings.figlet.figletStrings.Greek = "Greek".asInstanceOf[typings.figlet.figletStrings.Greek]
    
    inline def `Heart Left`: typings.figlet.figletStrings.`Heart Left` = ("Heart Left").asInstanceOf[typings.figlet.figletStrings.`Heart Left`]
    
    inline def `Heart Right`: typings.figlet.figletStrings.`Heart Right` = ("Heart Right").asInstanceOf[typings.figlet.figletStrings.`Heart Right`]
    
    inline def `Henry 3D`: typings.figlet.figletStrings.`Henry 3D` = ("Henry 3D").asInstanceOf[typings.figlet.figletStrings.`Henry 3D`]
    
    inline def Hex: typings.figlet.figletStrings.Hex = "Hex".asInstanceOf[typings.figlet.figletStrings.Hex]
    
    inline def Hieroglyphs: typings.figlet.figletStrings.Hieroglyphs = "Hieroglyphs".asInstanceOf[typings.figlet.figletStrings.Hieroglyphs]
    
    inline def Hollywood: typings.figlet.figletStrings.Hollywood = "Hollywood".asInstanceOf[typings.figlet.figletStrings.Hollywood]
    
    inline def `Horizontal Left`: typings.figlet.figletStrings.`Horizontal Left` = ("Horizontal Left").asInstanceOf[typings.figlet.figletStrings.`Horizontal Left`]
    
    inline def `Horizontal Right`: typings.figlet.figletStrings.`Horizontal Right` = ("Horizontal Right").asInstanceOf[typings.figlet.figletStrings.`Horizontal Right`]
    
    inline def `ICL-1900`: typings.figlet.figletStrings.`ICL-1900` = "ICL-1900".asInstanceOf[typings.figlet.figletStrings.`ICL-1900`]
    
    inline def Impossible: typings.figlet.figletStrings.Impossible = "Impossible".asInstanceOf[typings.figlet.figletStrings.Impossible]
    
    inline def Invita: typings.figlet.figletStrings.Invita = "Invita".asInstanceOf[typings.figlet.figletStrings.Invita]
    
    inline def Isometric1: typings.figlet.figletStrings.Isometric1 = "Isometric1".asInstanceOf[typings.figlet.figletStrings.Isometric1]
    
    inline def Isometric2: typings.figlet.figletStrings.Isometric2 = "Isometric2".asInstanceOf[typings.figlet.figletStrings.Isometric2]
    
    inline def Isometric3: typings.figlet.figletStrings.Isometric3 = "Isometric3".asInstanceOf[typings.figlet.figletStrings.Isometric3]
    
    inline def Isometric4: typings.figlet.figletStrings.Isometric4 = "Isometric4".asInstanceOf[typings.figlet.figletStrings.Isometric4]
    
    inline def Italic: typings.figlet.figletStrings.Italic = "Italic".asInstanceOf[typings.figlet.figletStrings.Italic]
    
    inline def Ivrit: typings.figlet.figletStrings.Ivrit = "Ivrit".asInstanceOf[typings.figlet.figletStrings.Ivrit]
    
    inline def `JS Block Letters`: typings.figlet.figletStrings.`JS Block Letters` = ("JS Block Letters").asInstanceOf[typings.figlet.figletStrings.`JS Block Letters`]
    
    inline def `JS Bracket Letters`: typings.figlet.figletStrings.`JS Bracket Letters` = ("JS Bracket Letters").asInstanceOf[typings.figlet.figletStrings.`JS Bracket Letters`]
    
    inline def `JS Capital Curves`: typings.figlet.figletStrings.`JS Capital Curves` = ("JS Capital Curves").asInstanceOf[typings.figlet.figletStrings.`JS Capital Curves`]
    
    inline def `JS Cursive`: typings.figlet.figletStrings.`JS Cursive` = ("JS Cursive").asInstanceOf[typings.figlet.figletStrings.`JS Cursive`]
    
    inline def `JS Stick Letters`: typings.figlet.figletStrings.`JS Stick Letters` = ("JS Stick Letters").asInstanceOf[typings.figlet.figletStrings.`JS Stick Letters`]
    
    inline def Jacky: typings.figlet.figletStrings.Jacky = "Jacky".asInstanceOf[typings.figlet.figletStrings.Jacky]
    
    inline def Jazmine: typings.figlet.figletStrings.Jazmine = "Jazmine".asInstanceOf[typings.figlet.figletStrings.Jazmine]
    
    inline def Jerusalem: typings.figlet.figletStrings.Jerusalem = "Jerusalem".asInstanceOf[typings.figlet.figletStrings.Jerusalem]
    
    inline def Katakana: typings.figlet.figletStrings.Katakana = "Katakana".asInstanceOf[typings.figlet.figletStrings.Katakana]
    
    inline def Kban: typings.figlet.figletStrings.Kban = "Kban".asInstanceOf[typings.figlet.figletStrings.Kban]
    
    inline def Keyboard: typings.figlet.figletStrings.Keyboard = "Keyboard".asInstanceOf[typings.figlet.figletStrings.Keyboard]
    
    inline def Knob: typings.figlet.figletStrings.Knob = "Knob".asInstanceOf[typings.figlet.figletStrings.Knob]
    
    inline def Konto: typings.figlet.figletStrings.Konto = "Konto".asInstanceOf[typings.figlet.figletStrings.Konto]
    
    inline def `Konto Slant`: typings.figlet.figletStrings.`Konto Slant` = ("Konto Slant").asInstanceOf[typings.figlet.figletStrings.`Konto Slant`]
    
    inline def LCD: typings.figlet.figletStrings.LCD = "LCD".asInstanceOf[typings.figlet.figletStrings.LCD]
    
    inline def `Larry 3D`: typings.figlet.figletStrings.`Larry 3D` = ("Larry 3D").asInstanceOf[typings.figlet.figletStrings.`Larry 3D`]
    
    inline def `Larry 3D 2`: typings.figlet.figletStrings.`Larry 3D 2` = ("Larry 3D 2").asInstanceOf[typings.figlet.figletStrings.`Larry 3D 2`]
    
    inline def Lean: typings.figlet.figletStrings.Lean = "Lean".asInstanceOf[typings.figlet.figletStrings.Lean]
    
    inline def Letters: typings.figlet.figletStrings.Letters = "Letters".asInstanceOf[typings.figlet.figletStrings.Letters]
    
    inline def `Lil Devil`: typings.figlet.figletStrings.`Lil Devil` = ("Lil Devil").asInstanceOf[typings.figlet.figletStrings.`Lil Devil`]
    
    inline def `Line Blocks`: typings.figlet.figletStrings.`Line Blocks` = ("Line Blocks").asInstanceOf[typings.figlet.figletStrings.`Line Blocks`]
    
    inline def Linux: typings.figlet.figletStrings.Linux = "Linux".asInstanceOf[typings.figlet.figletStrings.Linux]
    
    inline def Lockergnome: typings.figlet.figletStrings.Lockergnome = "Lockergnome".asInstanceOf[typings.figlet.figletStrings.Lockergnome]
    
    inline def Madrid: typings.figlet.figletStrings.Madrid = "Madrid".asInstanceOf[typings.figlet.figletStrings.Madrid]
    
    inline def Marquee: typings.figlet.figletStrings.Marquee = "Marquee".asInstanceOf[typings.figlet.figletStrings.Marquee]
    
    inline def Maxfour: typings.figlet.figletStrings.Maxfour = "Maxfour".asInstanceOf[typings.figlet.figletStrings.Maxfour]
    
    inline def Merlin1: typings.figlet.figletStrings.Merlin1 = "Merlin1".asInstanceOf[typings.figlet.figletStrings.Merlin1]
    
    inline def Merlin2: typings.figlet.figletStrings.Merlin2 = "Merlin2".asInstanceOf[typings.figlet.figletStrings.Merlin2]
    
    inline def Mike: typings.figlet.figletStrings.Mike = "Mike".asInstanceOf[typings.figlet.figletStrings.Mike]
    
    inline def Mini: typings.figlet.figletStrings.Mini = "Mini".asInstanceOf[typings.figlet.figletStrings.Mini]
    
    inline def Mirror: typings.figlet.figletStrings.Mirror = "Mirror".asInstanceOf[typings.figlet.figletStrings.Mirror]
    
    inline def Mnemonic: typings.figlet.figletStrings.Mnemonic = "Mnemonic".asInstanceOf[typings.figlet.figletStrings.Mnemonic]
    
    inline def Modular: typings.figlet.figletStrings.Modular = "Modular".asInstanceOf[typings.figlet.figletStrings.Modular]
    
    inline def Morse: typings.figlet.figletStrings.Morse = "Morse".asInstanceOf[typings.figlet.figletStrings.Morse]
    
    inline def Morse2: typings.figlet.figletStrings.Morse2 = "Morse2".asInstanceOf[typings.figlet.figletStrings.Morse2]
    
    inline def Moscow: typings.figlet.figletStrings.Moscow = "Moscow".asInstanceOf[typings.figlet.figletStrings.Moscow]
    
    inline def Mshebrew210: typings.figlet.figletStrings.Mshebrew210 = "Mshebrew210".asInstanceOf[typings.figlet.figletStrings.Mshebrew210]
    
    inline def Muzzle: typings.figlet.figletStrings.Muzzle = "Muzzle".asInstanceOf[typings.figlet.figletStrings.Muzzle]
    
    inline def NScript: typings.figlet.figletStrings.NScript = "NScript".asInstanceOf[typings.figlet.figletStrings.NScript]
    
    inline def `NT Greek`: typings.figlet.figletStrings.`NT Greek` = ("NT Greek").asInstanceOf[typings.figlet.figletStrings.`NT Greek`]
    
    inline def `NV Script`: typings.figlet.figletStrings.`NV Script` = ("NV Script").asInstanceOf[typings.figlet.figletStrings.`NV Script`]
    
    inline def Nancyj: typings.figlet.figletStrings.Nancyj = "Nancyj".asInstanceOf[typings.figlet.figletStrings.Nancyj]
    
    inline def `Nancyj-Fancy`: typings.figlet.figletStrings.`Nancyj-Fancy` = "Nancyj-Fancy".asInstanceOf[typings.figlet.figletStrings.`Nancyj-Fancy`]
    
    inline def `Nancyj-Improved`: typings.figlet.figletStrings.`Nancyj-Improved` = "Nancyj-Improved".asInstanceOf[typings.figlet.figletStrings.`Nancyj-Improved`]
    
    inline def `Nancyj-Underlined`: typings.figlet.figletStrings.`Nancyj-Underlined` = "Nancyj-Underlined".asInstanceOf[typings.figlet.figletStrings.`Nancyj-Underlined`]
    
    inline def Nipples: typings.figlet.figletStrings.Nipples = "Nipples".asInstanceOf[typings.figlet.figletStrings.Nipples]
    
    inline def O8: typings.figlet.figletStrings.O8 = "O8".asInstanceOf[typings.figlet.figletStrings.O8]
    
    inline def OS2: typings.figlet.figletStrings.OS2 = "OS2".asInstanceOf[typings.figlet.figletStrings.OS2]
    
    inline def Octal: typings.figlet.figletStrings.Octal = "Octal".asInstanceOf[typings.figlet.figletStrings.Octal]
    
    inline def Ogre: typings.figlet.figletStrings.Ogre = "Ogre".asInstanceOf[typings.figlet.figletStrings.Ogre]
    
    inline def `Old Banner`: typings.figlet.figletStrings.`Old Banner` = ("Old Banner").asInstanceOf[typings.figlet.figletStrings.`Old Banner`]
    
    inline def `Patorjk-HeX`: typings.figlet.figletStrings.`Patorjk-HeX` = "Patorjk-HeX".asInstanceOf[typings.figlet.figletStrings.`Patorjk-HeX`]
    
    inline def `PatorjkApostrophes Cheese`: typings.figlet.figletStrings.`PatorjkApostrophes Cheese` = ("Patorjk's Cheese").asInstanceOf[typings.figlet.figletStrings.`PatorjkApostrophes Cheese`]
    
    inline def Pawp: typings.figlet.figletStrings.Pawp = "Pawp".asInstanceOf[typings.figlet.figletStrings.Pawp]
    
    inline def Peaks: typings.figlet.figletStrings.Peaks = "Peaks".asInstanceOf[typings.figlet.figletStrings.Peaks]
    
    inline def `Peaks Slant`: typings.figlet.figletStrings.`Peaks Slant` = ("Peaks Slant").asInstanceOf[typings.figlet.figletStrings.`Peaks Slant`]
    
    inline def Pebbles: typings.figlet.figletStrings.Pebbles = "Pebbles".asInstanceOf[typings.figlet.figletStrings.Pebbles]
    
    inline def Pepper: typings.figlet.figletStrings.Pepper = "Pepper".asInstanceOf[typings.figlet.figletStrings.Pepper]
    
    inline def Poison: typings.figlet.figletStrings.Poison = "Poison".asInstanceOf[typings.figlet.figletStrings.Poison]
    
    inline def Puffy: typings.figlet.figletStrings.Puffy = "Puffy".asInstanceOf[typings.figlet.figletStrings.Puffy]
    
    inline def Puzzle: typings.figlet.figletStrings.Puzzle = "Puzzle".asInstanceOf[typings.figlet.figletStrings.Puzzle]
    
    inline def Pyramid: typings.figlet.figletStrings.Pyramid = "Pyramid".asInstanceOf[typings.figlet.figletStrings.Pyramid]
    
    inline def Rammstein: typings.figlet.figletStrings.Rammstein = "Rammstein".asInstanceOf[typings.figlet.figletStrings.Rammstein]
    
    inline def Rectangles: typings.figlet.figletStrings.Rectangles = "Rectangles".asInstanceOf[typings.figlet.figletStrings.Rectangles]
    
    inline def `Red Phoenix`: typings.figlet.figletStrings.`Red Phoenix` = ("Red Phoenix").asInstanceOf[typings.figlet.figletStrings.`Red Phoenix`]
    
    inline def Relief: typings.figlet.figletStrings.Relief = "Relief".asInstanceOf[typings.figlet.figletStrings.Relief]
    
    inline def Relief2: typings.figlet.figletStrings.Relief2 = "Relief2".asInstanceOf[typings.figlet.figletStrings.Relief2]
    
    inline def Reverse: typings.figlet.figletStrings.Reverse = "Reverse".asInstanceOf[typings.figlet.figletStrings.Reverse]
    
    inline def Roman: typings.figlet.figletStrings.Roman = "Roman".asInstanceOf[typings.figlet.figletStrings.Roman]
    
    inline def Rot13: typings.figlet.figletStrings.Rot13 = "Rot13".asInstanceOf[typings.figlet.figletStrings.Rot13]
    
    inline def Rotated: typings.figlet.figletStrings.Rotated = "Rotated".asInstanceOf[typings.figlet.figletStrings.Rotated]
    
    inline def Rounded: typings.figlet.figletStrings.Rounded = "Rounded".asInstanceOf[typings.figlet.figletStrings.Rounded]
    
    inline def `Rowan Cap`: typings.figlet.figletStrings.`Rowan Cap` = ("Rowan Cap").asInstanceOf[typings.figlet.figletStrings.`Rowan Cap`]
    
    inline def Rozzo: typings.figlet.figletStrings.Rozzo = "Rozzo".asInstanceOf[typings.figlet.figletStrings.Rozzo]
    
    inline def Runic: typings.figlet.figletStrings.Runic = "Runic".asInstanceOf[typings.figlet.figletStrings.Runic]
    
    inline def Runyc: typings.figlet.figletStrings.Runyc = "Runyc".asInstanceOf[typings.figlet.figletStrings.Runyc]
    
    inline def `S Blood`: typings.figlet.figletStrings.`S Blood` = ("S Blood").asInstanceOf[typings.figlet.figletStrings.`S Blood`]
    
    inline def `SL Script`: typings.figlet.figletStrings.`SL Script` = ("SL Script").asInstanceOf[typings.figlet.figletStrings.`SL Script`]
    
    inline def `Santa Clara`: typings.figlet.figletStrings.`Santa Clara` = ("Santa Clara").asInstanceOf[typings.figlet.figletStrings.`Santa Clara`]
    
    inline def Script: typings.figlet.figletStrings.Script = "Script".asInstanceOf[typings.figlet.figletStrings.Script]
    
    inline def Serifcap: typings.figlet.figletStrings.Serifcap = "Serifcap".asInstanceOf[typings.figlet.figletStrings.Serifcap]
    
    inline def Shadow: typings.figlet.figletStrings.Shadow = "Shadow".asInstanceOf[typings.figlet.figletStrings.Shadow]
    
    inline def Shimrod: typings.figlet.figletStrings.Shimrod = "Shimrod".asInstanceOf[typings.figlet.figletStrings.Shimrod]
    
    inline def Short: typings.figlet.figletStrings.Short = "Short".asInstanceOf[typings.figlet.figletStrings.Short]
    
    inline def Slant: typings.figlet.figletStrings.Slant = "Slant".asInstanceOf[typings.figlet.figletStrings.Slant]
    
    inline def `Slant Relief`: typings.figlet.figletStrings.`Slant Relief` = ("Slant Relief").asInstanceOf[typings.figlet.figletStrings.`Slant Relief`]
    
    inline def Slide: typings.figlet.figletStrings.Slide = "Slide".asInstanceOf[typings.figlet.figletStrings.Slide]
    
    inline def Small: typings.figlet.figletStrings.Small = "Small".asInstanceOf[typings.figlet.figletStrings.Small]
    
    inline def `Small Caps`: typings.figlet.figletStrings.`Small Caps` = ("Small Caps").asInstanceOf[typings.figlet.figletStrings.`Small Caps`]
    
    inline def `Small Isometric1`: typings.figlet.figletStrings.`Small Isometric1` = ("Small Isometric1").asInstanceOf[typings.figlet.figletStrings.`Small Isometric1`]
    
    inline def `Small Keyboard`: typings.figlet.figletStrings.`Small Keyboard` = ("Small Keyboard").asInstanceOf[typings.figlet.figletStrings.`Small Keyboard`]
    
    inline def `Small Poison`: typings.figlet.figletStrings.`Small Poison` = ("Small Poison").asInstanceOf[typings.figlet.figletStrings.`Small Poison`]
    
    inline def `Small Script`: typings.figlet.figletStrings.`Small Script` = ("Small Script").asInstanceOf[typings.figlet.figletStrings.`Small Script`]
    
    inline def `Small Shadow`: typings.figlet.figletStrings.`Small Shadow` = ("Small Shadow").asInstanceOf[typings.figlet.figletStrings.`Small Shadow`]
    
    inline def `Small Slant`: typings.figlet.figletStrings.`Small Slant` = ("Small Slant").asInstanceOf[typings.figlet.figletStrings.`Small Slant`]
    
    inline def `Small Tengwar`: typings.figlet.figletStrings.`Small Tengwar` = ("Small Tengwar").asInstanceOf[typings.figlet.figletStrings.`Small Tengwar`]
    
    inline def Soft: typings.figlet.figletStrings.Soft = "Soft".asInstanceOf[typings.figlet.figletStrings.Soft]
    
    inline def Speed: typings.figlet.figletStrings.Speed = "Speed".asInstanceOf[typings.figlet.figletStrings.Speed]
    
    inline def Spliff: typings.figlet.figletStrings.Spliff = "Spliff".asInstanceOf[typings.figlet.figletStrings.Spliff]
    
    inline def Stacey: typings.figlet.figletStrings.Stacey = "Stacey".asInstanceOf[typings.figlet.figletStrings.Stacey]
    
    inline def Stampate: typings.figlet.figletStrings.Stampate = "Stampate".asInstanceOf[typings.figlet.figletStrings.Stampate]
    
    inline def Stampatello: typings.figlet.figletStrings.Stampatello = "Stampatello".asInstanceOf[typings.figlet.figletStrings.Stampatello]
    
    inline def Standard: typings.figlet.figletStrings.Standard = "Standard".asInstanceOf[typings.figlet.figletStrings.Standard]
    
    inline def `Star Strips`: typings.figlet.figletStrings.`Star Strips` = ("Star Strips").asInstanceOf[typings.figlet.figletStrings.`Star Strips`]
    
    inline def `Star Wars`: typings.figlet.figletStrings.`Star Wars` = ("Star Wars").asInstanceOf[typings.figlet.figletStrings.`Star Wars`]
    
    inline def Stellar: typings.figlet.figletStrings.Stellar = "Stellar".asInstanceOf[typings.figlet.figletStrings.Stellar]
    
    inline def Stforek: typings.figlet.figletStrings.Stforek = "Stforek".asInstanceOf[typings.figlet.figletStrings.Stforek]
    
    inline def `Stick Letters`: typings.figlet.figletStrings.`Stick Letters` = ("Stick Letters").asInstanceOf[typings.figlet.figletStrings.`Stick Letters`]
    
    inline def Stop: typings.figlet.figletStrings.Stop = "Stop".asInstanceOf[typings.figlet.figletStrings.Stop]
    
    inline def Straight: typings.figlet.figletStrings.Straight = "Straight".asInstanceOf[typings.figlet.figletStrings.Straight]
    
    inline def `Stronger Than All`: typings.figlet.figletStrings.`Stronger Than All` = ("Stronger Than All").asInstanceOf[typings.figlet.figletStrings.`Stronger Than All`]
    
    inline def `Sub-Zero`: typings.figlet.figletStrings.`Sub-Zero` = "Sub-Zero".asInstanceOf[typings.figlet.figletStrings.`Sub-Zero`]
    
    inline def `Swamp Land`: typings.figlet.figletStrings.`Swamp Land` = ("Swamp Land").asInstanceOf[typings.figlet.figletStrings.`Swamp Land`]
    
    inline def Swan: typings.figlet.figletStrings.Swan = "Swan".asInstanceOf[typings.figlet.figletStrings.Swan]
    
    inline def Sweet: typings.figlet.figletStrings.Sweet = "Sweet".asInstanceOf[typings.figlet.figletStrings.Sweet]
    
    inline def THIS: typings.figlet.figletStrings.THIS = "THIS".asInstanceOf[typings.figlet.figletStrings.THIS]
    
    inline def Tanja: typings.figlet.figletStrings.Tanja = "Tanja".asInstanceOf[typings.figlet.figletStrings.Tanja]
    
    inline def Tengwar: typings.figlet.figletStrings.Tengwar = "Tengwar".asInstanceOf[typings.figlet.figletStrings.Tengwar]
    
    inline def Term: typings.figlet.figletStrings.Term = "Term".asInstanceOf[typings.figlet.figletStrings.Term]
    
    inline def Test1: typings.figlet.figletStrings.Test1 = "Test1".asInstanceOf[typings.figlet.figletStrings.Test1]
    
    inline def `The Edge`: typings.figlet.figletStrings.`The Edge` = ("The Edge").asInstanceOf[typings.figlet.figletStrings.`The Edge`]
    
    inline def Thick: typings.figlet.figletStrings.Thick = "Thick".asInstanceOf[typings.figlet.figletStrings.Thick]
    
    inline def Thin: typings.figlet.figletStrings.Thin = "Thin".asInstanceOf[typings.figlet.figletStrings.Thin]
    
    inline def Thorned: typings.figlet.figletStrings.Thorned = "Thorned".asInstanceOf[typings.figlet.figletStrings.Thorned]
    
    inline def `Three Point`: typings.figlet.figletStrings.`Three Point` = ("Three Point").asInstanceOf[typings.figlet.figletStrings.`Three Point`]
    
    inline def Ticks: typings.figlet.figletStrings.Ticks = "Ticks".asInstanceOf[typings.figlet.figletStrings.Ticks]
    
    inline def `Ticks Slant`: typings.figlet.figletStrings.`Ticks Slant` = ("Ticks Slant").asInstanceOf[typings.figlet.figletStrings.`Ticks Slant`]
    
    inline def Tiles: typings.figlet.figletStrings.Tiles = "Tiles".asInstanceOf[typings.figlet.figletStrings.Tiles]
    
    inline def `Tinker-Toy`: typings.figlet.figletStrings.`Tinker-Toy` = "Tinker-Toy".asInstanceOf[typings.figlet.figletStrings.`Tinker-Toy`]
    
    inline def Tombstone: typings.figlet.figletStrings.Tombstone = "Tombstone".asInstanceOf[typings.figlet.figletStrings.Tombstone]
    
    inline def Train: typings.figlet.figletStrings.Train = "Train".asInstanceOf[typings.figlet.figletStrings.Train]
    
    inline def Trek: typings.figlet.figletStrings.Trek = "Trek".asInstanceOf[typings.figlet.figletStrings.Trek]
    
    inline def Tsalagi: typings.figlet.figletStrings.Tsalagi = "Tsalagi".asInstanceOf[typings.figlet.figletStrings.Tsalagi]
    
    inline def Tubular: typings.figlet.figletStrings.Tubular = "Tubular".asInstanceOf[typings.figlet.figletStrings.Tubular]
    
    inline def Twisted: typings.figlet.figletStrings.Twisted = "Twisted".asInstanceOf[typings.figlet.figletStrings.Twisted]
    
    inline def `Two Point`: typings.figlet.figletStrings.`Two Point` = ("Two Point").asInstanceOf[typings.figlet.figletStrings.`Two Point`]
    
    inline def `USA Flag`: typings.figlet.figletStrings.`USA Flag` = ("USA Flag").asInstanceOf[typings.figlet.figletStrings.`USA Flag`]
    
    inline def Univers: typings.figlet.figletStrings.Univers = "Univers".asInstanceOf[typings.figlet.figletStrings.Univers]
    
    inline def Varsity: typings.figlet.figletStrings.Varsity = "Varsity".asInstanceOf[typings.figlet.figletStrings.Varsity]
    
    inline def Wavy: typings.figlet.figletStrings.Wavy = "Wavy".asInstanceOf[typings.figlet.figletStrings.Wavy]
    
    inline def Weird: typings.figlet.figletStrings.Weird = "Weird".asInstanceOf[typings.figlet.figletStrings.Weird]
    
    inline def `Wet Letter`: typings.figlet.figletStrings.`Wet Letter` = ("Wet Letter").asInstanceOf[typings.figlet.figletStrings.`Wet Letter`]
    
    inline def Whimsy: typings.figlet.figletStrings.Whimsy = "Whimsy".asInstanceOf[typings.figlet.figletStrings.Whimsy]
    
    inline def Wow: typings.figlet.figletStrings.Wow = "Wow".asInstanceOf[typings.figlet.figletStrings.Wow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.figlet.figletStrings.default
    - typings.figlet.figletStrings.full
    - typings.figlet.figletStrings.fitted
    - typings.figlet.figletStrings.`controlled smushing`
    - typings.figlet.figletStrings.`universal smushing`
  */
  trait KerningMethods extends StObject
  object KerningMethods {
    
    inline def default: typings.figlet.figletStrings.default = "default".asInstanceOf[typings.figlet.figletStrings.default]
    
    inline def `controlled smushing`: typings.figlet.figletStrings.`controlled smushing` = ("controlled smushing").asInstanceOf[typings.figlet.figletStrings.`controlled smushing`]
    
    inline def fitted: typings.figlet.figletStrings.fitted = "fitted".asInstanceOf[typings.figlet.figletStrings.fitted]
    
    inline def full: typings.figlet.figletStrings.full = "full".asInstanceOf[typings.figlet.figletStrings.full]
    
    inline def `universal smushing`: typings.figlet.figletStrings.`universal smushing` = ("universal smushing").asInstanceOf[typings.figlet.figletStrings.`universal smushing`]
  }
  
  trait Options extends StObject {
    
    var font: js.UndefOr[Fonts_] = js.undefined
    
    var horizontalLayout: js.UndefOr[KerningMethods] = js.undefined
    
    var printDirection: js.UndefOr[PrintDirection] = js.undefined
    
    var showHardBlanks: js.UndefOr[Boolean] = js.undefined
    
    var verticalLayout: js.UndefOr[KerningMethods] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFont(value: Fonts_): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalLayout(value: KerningMethods): Self = StObject.set(x, "horizontalLayout", value.asInstanceOf[js.Any])
      
      inline def setHorizontalLayoutUndefined: Self = StObject.set(x, "horizontalLayout", js.undefined)
      
      inline def setPrintDirection(value: PrintDirection): Self = StObject.set(x, "printDirection", value.asInstanceOf[js.Any])
      
      inline def setPrintDirectionUndefined: Self = StObject.set(x, "printDirection", js.undefined)
      
      inline def setShowHardBlanks(value: Boolean): Self = StObject.set(x, "showHardBlanks", value.asInstanceOf[js.Any])
      
      inline def setShowHardBlanksUndefined: Self = StObject.set(x, "showHardBlanks", js.undefined)
      
      inline def setVerticalLayout(value: KerningMethods): Self = StObject.set(x, "verticalLayout", value.asInstanceOf[js.Any])
      
      inline def setVerticalLayoutUndefined: Self = StObject.set(x, "verticalLayout", js.undefined)
    }
  }
  
  type PrintDirection = Double
}
