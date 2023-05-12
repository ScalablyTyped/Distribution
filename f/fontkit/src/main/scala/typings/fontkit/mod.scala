package typings.fontkit

import typings.fontkit.anon.BitmapOnly
import typings.fontkit.anon.Italic
import typings.fontkit.fontkitStrings.bezierCurveTo
import typings.fontkit.fontkitStrings.closePath
import typings.fontkit.fontkitStrings.lineTo
import typings.fontkit.fontkitStrings.moveTo
import typings.fontkit.fontkitStrings.quadraticCurveTo
import typings.node.bufferMod.global.Buffer
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fontkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(buffer: Buffer): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any]).asInstanceOf[Font]
  inline def create(buffer: Buffer, postscriptName: String): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any], postscriptName.asInstanceOf[js.Any])).asInstanceOf[Font]
  
  inline def open(filename: String): js.Promise[Font] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Font]]
  inline def open(filename: String, postscriptName: String): js.Promise[Font] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filename.asInstanceOf[js.Any], postscriptName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Font]]
  
  inline def openSync(filename: String): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Font]
  inline def openSync(filename: String, postscriptName: String): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(filename.asInstanceOf[js.Any], postscriptName.asInstanceOf[js.Any])).asInstanceOf[Font]
  
  trait BBOX extends StObject {
    
    var height: Double
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var width: Double
  }
  object BBOX {
    
    inline def apply(height: Double, maxX: Double, maxY: Double, minX: Double, minY: Double, width: Double): BBOX = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBOX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BBOX] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Font extends StObject {
    
    /** the font metric table consisting of a set of metrics and other data required for OpenType fonts */
    @JSName("OS/2")
    var OSSlash2: Os2Table = js.native
    
    /** the font’s ascender */
    var ascent: Double = js.native
    
    /** an array of all OpenType feature tags (or mapped AAT tags) supported by the font */
    var availableFeatures: js.Array[String] = js.native
    
    /** the font’s bounding box, i.e. the box that encloses all glyphs in the font */
    var bbox: BBOX = js.native
    
    /** the height of capital letters above the baseline */
    var capHeight: Double = js.native
    
    /** an array of all of the unicode code points supported by the font */
    var characterSet: js.Array[Double] = js.native
    
    var copyright: String = js.native
    
    /** the font’s descender */
    var descent: Double = js.native
    
    var familyName: String = js.native
    
    var fullName: String = js.native
    
    /**
      * Returns a glyph object for the given glyph id. You can pass the array of
      * code points this glyph represents for your use later, and it will be
      * stored in the glyph object.
      */
    def getGlyph(glyphId: Double): Glyph = js.native
    def getGlyph(glyphId: Double, codePoints: js.Array[Double]): Glyph = js.native
    
    /**
      * Maps a single unicode code point to a Glyph object.
      * Does not perform any advanced substitutions (there is no context to do so).
      */
    def glyphForCodePoint(codePoint: Double): Glyph = js.native
    
    /**
      * Returns an array of Glyph objects for the given string.
      * This is only a one-to-one mapping from characters to glyphs.
      * For most uses, you should use font.layout (described below), which
      * provides a much more advanced mapping supporting AAT and OpenType shaping.
      */
    def glyphsForString(string: String): js.Array[Glyph] = js.native
    
    /**
      * Returns whether there is glyph in the font for the given unicode code point.
      */
    def hasGlyphForCodePoint(codePoint: Double): Boolean = js.native
    
    /** the font's horizontal header table consisting of information needed to layout fonts with horizontal characters    */
    var hhea: HHEA = js.native
    
    /** if this is an italic font, the angle the cursor should be drawn at to match the font design */
    var italicAngle: Double = js.native
    
    /**
      * Returns a GlyphRun object, which includes an array of Glyphs and GlyphPositions for the given string.
      */
    def layout(string: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String]): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String, language: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: Unit, language: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: Unit, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: Unit, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String, language: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: Unit, language: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: Unit, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: Unit, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean]): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: String): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: String, language: String): GlyphRun = js.native
    def layout(
      string: String,
      features: Record[String, Boolean],
      script: String,
      language: String,
      direction: String
    ): GlyphRun = js.native
    def layout(
      string: String,
      features: Record[String, Boolean],
      script: String,
      language: Unit,
      direction: String
    ): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: Unit, language: String): GlyphRun = js.native
    def layout(
      string: String,
      features: Record[String, Boolean],
      script: Unit,
      language: String,
      direction: String
    ): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: Unit, language: Unit, direction: String): GlyphRun = js.native
    
    /** the amount of space that should be included between lines */
    var lineGap: Double = js.native
    
    /** the number of glyphs in the font */
    var numGlyphs: Double = js.native
    
    var postscriptName: String = js.native
    
    /**
      * Returns an array of strings that map to the given glyph id.
      */
    def stringsForGlyph(gid: Double): js.Array[String] = js.native
    
    var subfamilyName: String = js.native
    
    /** the offset from the normal underline position that should be used */
    var underlinePosition: Double = js.native
    
    /** the weight of the underline that should be used */
    var underlineThickness: Double = js.native
    
    /** the size of the font’s internal coordinate grid */
    var unitsPerEm: Double = js.native
    
    var version: Double = js.native
    
    /**
      * Returns the advance width for a single glyph id.
      */
    def widthOfGlyph(glyph_id: Double): Double = js.native
    
    /** the height of lower case letters */
    var xHeight: Double = js.native
  }
  
  trait Glyph extends StObject {
    
    /** the glyph’s advance width */
    var advanceWidth: Double
    
    /** the glyph’s bounding box, i.e. the rectangle that encloses the glyph outline as tightly as possible. */
    var bbox: BBOX
    
    /**
      * The glyph’s control box.
      * This is often the same as the bounding box, but is faster to compute.
      * Because of the way bezier curves are defined, some of the control points
      * can be outside of the bounding box. Where `bbox` takes this into account,
      * `cbox` does not. Thus, cbox is less accurate, but faster to compute.
      * See [here](http://www.freetype.org/freetype2/docs/glyphs/glyphs-6.html#section-2)
      * for a more detailed description.
      */
    var cbox: BBOX
    
    /**
      * An array of unicode code points that are represented by this glyph.
      * There can be multiple code points in the case of ligatures and other glyphs
      * that represent multiple visual characters.
      */
    var codePoints: js.Array[Double]
    
    /** the glyph id in the font */
    var id: Double
    
    /** is a ligature glyph (multiple character, spacing glyph) */
    var isLigature: Boolean
    
    /** is a mark glyph (non-spacing combining glyph) */
    var isMark: Boolean
    
    /**  The glyph's name. Commonly the character, or 'space' or UTF**** */
    var name: String
    
    /** a vector Path object representing the glyph */
    var path: Path
    
    /** Renders the glyph to the given graphics context, at the specified font size. */
    def render(ctx: CanvasRenderingContext2D, size: Double): Unit
  }
  object Glyph {
    
    inline def apply(
      advanceWidth: Double,
      bbox: BBOX,
      cbox: BBOX,
      codePoints: js.Array[Double],
      id: Double,
      isLigature: Boolean,
      isMark: Boolean,
      name: String,
      path: Path,
      render: (CanvasRenderingContext2D, Double) => Unit
    ): Glyph = {
      val __obj = js.Dynamic.literal(advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], cbox = cbox.asInstanceOf[js.Any], codePoints = codePoints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLigature = isLigature.asInstanceOf[js.Any], isMark = isMark.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[Glyph]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Glyph] (val x: Self) extends AnyVal {
      
      inline def setAdvanceWidth(value: Double): Self = StObject.set(x, "advanceWidth", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: BBOX): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setCbox(value: BBOX): Self = StObject.set(x, "cbox", value.asInstanceOf[js.Any])
      
      inline def setCodePoints(value: js.Array[Double]): Self = StObject.set(x, "codePoints", value.asInstanceOf[js.Any])
      
      inline def setCodePointsVarargs(value: Double*): Self = StObject.set(x, "codePoints", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLigature(value: Boolean): Self = StObject.set(x, "isLigature", value.asInstanceOf[js.Any])
      
      inline def setIsMark(value: Boolean): Self = StObject.set(x, "isMark", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (CanvasRenderingContext2D, Double) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  trait GlyphPosition extends StObject {
    
    /** The amount to move the virtual pen in the X direction after rendering this glyph. */
    var xAdvance: Double
    
    /** The offset from the pen position in the X direction at which to render this glyph. */
    var xOffset: Double
    
    /** The amount to move the virtual pen in the Y direction after rendering this glyph. */
    var yAdvance: Double
    
    /** The offset from the pen position in the Y direction at which to render this glyph. */
    var yOffset: Double
  }
  object GlyphPosition {
    
    inline def apply(xAdvance: Double, xOffset: Double, yAdvance: Double, yOffset: Double): GlyphPosition = {
      val __obj = js.Dynamic.literal(xAdvance = xAdvance.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yAdvance = yAdvance.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlyphPosition] (val x: Self) extends AnyVal {
      
      inline def setXAdvance(value: Double): Self = StObject.set(x, "xAdvance", value.asInstanceOf[js.Any])
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setYAdvance(value: Double): Self = StObject.set(x, "yAdvance", value.asInstanceOf[js.Any])
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlyphRun extends StObject {
    
    /**
      * The total advance height of the run.
      */
    var advanceHeight: Double
    
    /**
      * The total advance width of the run.
      */
    var advanceWidth: Double
    
    /**
      * The bounding box containing all glyphs in the run.
      */
    var bbox: BBOX
    
    /**
      * The direction requested for shaping, as passed in (either ltr or rtl).
      * If `null`, the default direction of the script is used.
      */
    var direction: String
    
    /**
      * The features requested during shaping. This is a combination of user
      * specified features and features chosen by the shaper.
      */
    var features: Record[String, Boolean]
    
    /**
      * An array of Glyph objects in the run
      */
    var glyphs: js.Array[Glyph]
    
    /**
      * The language requested for shaping, as passed in. If `null`, the default language for the
      * script was used.
      */
    var language: String
    
    /**
      * An array of GlyphPosition objects for each glyph in the run
      */
    var positions: js.Array[GlyphPosition]
    
    /**
      * The script that was requested for shaping. This was either passed in or detected automatically.
      */
    var script: String
  }
  object GlyphRun {
    
    inline def apply(
      advanceHeight: Double,
      advanceWidth: Double,
      bbox: BBOX,
      direction: String,
      features: Record[String, Boolean],
      glyphs: js.Array[Glyph],
      language: String,
      positions: js.Array[GlyphPosition],
      script: String
    ): GlyphRun = {
      val __obj = js.Dynamic.literal(advanceHeight = advanceHeight.asInstanceOf[js.Any], advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphRun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlyphRun] (val x: Self) extends AnyVal {
      
      inline def setAdvanceHeight(value: Double): Self = StObject.set(x, "advanceHeight", value.asInstanceOf[js.Any])
      
      inline def setAdvanceWidth(value: Double): Self = StObject.set(x, "advanceWidth", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: BBOX): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: Record[String, Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setGlyphs(value: js.Array[Glyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      inline def setGlyphsVarargs(value: Glyph*): Self = StObject.set(x, "glyphs", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPositions(value: js.Array[GlyphPosition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: GlyphPosition*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  trait HHEA extends StObject {
    
    var advanceWidthMax: Double
    
    var ascent: Double
    
    var caretOffset: Double
    
    var caretSlopeRise: Double
    
    var caretSlopeRun: Double
    
    var descent: Double
    
    var lineGap: Double
    
    var metricDataFormat: Double
    
    var minLeftSideBearing: Double
    
    var minRightSideBearing: Double
    
    var numberOfMetrics: Double
    
    var version: Double
    
    var xMaxExtent: Double
  }
  object HHEA {
    
    inline def apply(
      advanceWidthMax: Double,
      ascent: Double,
      caretOffset: Double,
      caretSlopeRise: Double,
      caretSlopeRun: Double,
      descent: Double,
      lineGap: Double,
      metricDataFormat: Double,
      minLeftSideBearing: Double,
      minRightSideBearing: Double,
      numberOfMetrics: Double,
      version: Double,
      xMaxExtent: Double
    ): HHEA = {
      val __obj = js.Dynamic.literal(advanceWidthMax = advanceWidthMax.asInstanceOf[js.Any], ascent = ascent.asInstanceOf[js.Any], caretOffset = caretOffset.asInstanceOf[js.Any], caretSlopeRise = caretSlopeRise.asInstanceOf[js.Any], caretSlopeRun = caretSlopeRun.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], lineGap = lineGap.asInstanceOf[js.Any], metricDataFormat = metricDataFormat.asInstanceOf[js.Any], minLeftSideBearing = minLeftSideBearing.asInstanceOf[js.Any], minRightSideBearing = minRightSideBearing.asInstanceOf[js.Any], numberOfMetrics = numberOfMetrics.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], xMaxExtent = xMaxExtent.asInstanceOf[js.Any])
      __obj.asInstanceOf[HHEA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HHEA] (val x: Self) extends AnyVal {
      
      inline def setAdvanceWidthMax(value: Double): Self = StObject.set(x, "advanceWidthMax", value.asInstanceOf[js.Any])
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setCaretOffset(value: Double): Self = StObject.set(x, "caretOffset", value.asInstanceOf[js.Any])
      
      inline def setCaretSlopeRise(value: Double): Self = StObject.set(x, "caretSlopeRise", value.asInstanceOf[js.Any])
      
      inline def setCaretSlopeRun(value: Double): Self = StObject.set(x, "caretSlopeRun", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setLineGap(value: Double): Self = StObject.set(x, "lineGap", value.asInstanceOf[js.Any])
      
      inline def setMetricDataFormat(value: Double): Self = StObject.set(x, "metricDataFormat", value.asInstanceOf[js.Any])
      
      inline def setMinLeftSideBearing(value: Double): Self = StObject.set(x, "minLeftSideBearing", value.asInstanceOf[js.Any])
      
      inline def setMinRightSideBearing(value: Double): Self = StObject.set(x, "minRightSideBearing", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMetrics(value: Double): Self = StObject.set(x, "numberOfMetrics", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setXMaxExtent(value: Double): Self = StObject.set(x, "xMaxExtent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Os2Table extends StObject {
    
    var breakChar: Double
    
    var capHeight: Double
    
    var codePageRange: js.Array[Double]
    
    var defaultChar: Double
    
    var fsSelection: Italic
    
    var fsType: BitmapOnly
    
    var maxContent: Double
    
    var panose: js.Array[Double]
    
    var sFamilyClass: Double
    
    var typoAscender: Double
    
    var typoDescender: Double
    
    var typoLineGap: Double
    
    var ulCharRange: js.Array[Double]
    
    var usFirstCharIndex: Double
    
    var usLastCharIndex: Double
    
    var usWeightClass: Double
    
    var usWidthClass: Double
    
    var vendorID: String
    
    var version: Double
    
    var winAscent: Double
    
    var winDescent: Double
    
    var xAvgCharWidth: Double
    
    var xHeight: Double
    
    var yStrikeoutPosition: Double
    
    var yStrikeoutSize: Double
    
    var ySubscriptXOffset: Double
    
    var ySubscriptXSize: Double
    
    var ySubscriptYOffset: Double
    
    var ySubscriptYSize: Double
    
    var ySuperscriptXOffset: Double
    
    var ySuperscriptXSize: Double
    
    var ySuperscriptYOffset: Double
    
    var ySuperscriptYSize: Double
  }
  object Os2Table {
    
    inline def apply(
      breakChar: Double,
      capHeight: Double,
      codePageRange: js.Array[Double],
      defaultChar: Double,
      fsSelection: Italic,
      fsType: BitmapOnly,
      maxContent: Double,
      panose: js.Array[Double],
      sFamilyClass: Double,
      typoAscender: Double,
      typoDescender: Double,
      typoLineGap: Double,
      ulCharRange: js.Array[Double],
      usFirstCharIndex: Double,
      usLastCharIndex: Double,
      usWeightClass: Double,
      usWidthClass: Double,
      vendorID: String,
      version: Double,
      winAscent: Double,
      winDescent: Double,
      xAvgCharWidth: Double,
      xHeight: Double,
      yStrikeoutPosition: Double,
      yStrikeoutSize: Double,
      ySubscriptXOffset: Double,
      ySubscriptXSize: Double,
      ySubscriptYOffset: Double,
      ySubscriptYSize: Double,
      ySuperscriptXOffset: Double,
      ySuperscriptXSize: Double,
      ySuperscriptYOffset: Double,
      ySuperscriptYSize: Double
    ): Os2Table = {
      val __obj = js.Dynamic.literal(breakChar = breakChar.asInstanceOf[js.Any], capHeight = capHeight.asInstanceOf[js.Any], codePageRange = codePageRange.asInstanceOf[js.Any], defaultChar = defaultChar.asInstanceOf[js.Any], fsSelection = fsSelection.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], maxContent = maxContent.asInstanceOf[js.Any], panose = panose.asInstanceOf[js.Any], sFamilyClass = sFamilyClass.asInstanceOf[js.Any], typoAscender = typoAscender.asInstanceOf[js.Any], typoDescender = typoDescender.asInstanceOf[js.Any], typoLineGap = typoLineGap.asInstanceOf[js.Any], ulCharRange = ulCharRange.asInstanceOf[js.Any], usFirstCharIndex = usFirstCharIndex.asInstanceOf[js.Any], usLastCharIndex = usLastCharIndex.asInstanceOf[js.Any], usWeightClass = usWeightClass.asInstanceOf[js.Any], usWidthClass = usWidthClass.asInstanceOf[js.Any], vendorID = vendorID.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winAscent = winAscent.asInstanceOf[js.Any], winDescent = winDescent.asInstanceOf[js.Any], xAvgCharWidth = xAvgCharWidth.asInstanceOf[js.Any], xHeight = xHeight.asInstanceOf[js.Any], yStrikeoutPosition = yStrikeoutPosition.asInstanceOf[js.Any], yStrikeoutSize = yStrikeoutSize.asInstanceOf[js.Any], ySubscriptXOffset = ySubscriptXOffset.asInstanceOf[js.Any], ySubscriptXSize = ySubscriptXSize.asInstanceOf[js.Any], ySubscriptYOffset = ySubscriptYOffset.asInstanceOf[js.Any], ySubscriptYSize = ySubscriptYSize.asInstanceOf[js.Any], ySuperscriptXOffset = ySuperscriptXOffset.asInstanceOf[js.Any], ySuperscriptXSize = ySuperscriptXSize.asInstanceOf[js.Any], ySuperscriptYOffset = ySuperscriptYOffset.asInstanceOf[js.Any], ySuperscriptYSize = ySuperscriptYSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Os2Table]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Os2Table] (val x: Self) extends AnyVal {
      
      inline def setBreakChar(value: Double): Self = StObject.set(x, "breakChar", value.asInstanceOf[js.Any])
      
      inline def setCapHeight(value: Double): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      inline def setCodePageRange(value: js.Array[Double]): Self = StObject.set(x, "codePageRange", value.asInstanceOf[js.Any])
      
      inline def setCodePageRangeVarargs(value: Double*): Self = StObject.set(x, "codePageRange", js.Array(value*))
      
      inline def setDefaultChar(value: Double): Self = StObject.set(x, "defaultChar", value.asInstanceOf[js.Any])
      
      inline def setFsSelection(value: Italic): Self = StObject.set(x, "fsSelection", value.asInstanceOf[js.Any])
      
      inline def setFsType(value: BitmapOnly): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
      
      inline def setMaxContent(value: Double): Self = StObject.set(x, "maxContent", value.asInstanceOf[js.Any])
      
      inline def setPanose(value: js.Array[Double]): Self = StObject.set(x, "panose", value.asInstanceOf[js.Any])
      
      inline def setPanoseVarargs(value: Double*): Self = StObject.set(x, "panose", js.Array(value*))
      
      inline def setSFamilyClass(value: Double): Self = StObject.set(x, "sFamilyClass", value.asInstanceOf[js.Any])
      
      inline def setTypoAscender(value: Double): Self = StObject.set(x, "typoAscender", value.asInstanceOf[js.Any])
      
      inline def setTypoDescender(value: Double): Self = StObject.set(x, "typoDescender", value.asInstanceOf[js.Any])
      
      inline def setTypoLineGap(value: Double): Self = StObject.set(x, "typoLineGap", value.asInstanceOf[js.Any])
      
      inline def setUlCharRange(value: js.Array[Double]): Self = StObject.set(x, "ulCharRange", value.asInstanceOf[js.Any])
      
      inline def setUlCharRangeVarargs(value: Double*): Self = StObject.set(x, "ulCharRange", js.Array(value*))
      
      inline def setUsFirstCharIndex(value: Double): Self = StObject.set(x, "usFirstCharIndex", value.asInstanceOf[js.Any])
      
      inline def setUsLastCharIndex(value: Double): Self = StObject.set(x, "usLastCharIndex", value.asInstanceOf[js.Any])
      
      inline def setUsWeightClass(value: Double): Self = StObject.set(x, "usWeightClass", value.asInstanceOf[js.Any])
      
      inline def setUsWidthClass(value: Double): Self = StObject.set(x, "usWidthClass", value.asInstanceOf[js.Any])
      
      inline def setVendorID(value: String): Self = StObject.set(x, "vendorID", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWinAscent(value: Double): Self = StObject.set(x, "winAscent", value.asInstanceOf[js.Any])
      
      inline def setWinDescent(value: Double): Self = StObject.set(x, "winDescent", value.asInstanceOf[js.Any])
      
      inline def setXAvgCharWidth(value: Double): Self = StObject.set(x, "xAvgCharWidth", value.asInstanceOf[js.Any])
      
      inline def setXHeight(value: Double): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      inline def setYStrikeoutPosition(value: Double): Self = StObject.set(x, "yStrikeoutPosition", value.asInstanceOf[js.Any])
      
      inline def setYStrikeoutSize(value: Double): Self = StObject.set(x, "yStrikeoutSize", value.asInstanceOf[js.Any])
      
      inline def setYSubscriptXOffset(value: Double): Self = StObject.set(x, "ySubscriptXOffset", value.asInstanceOf[js.Any])
      
      inline def setYSubscriptXSize(value: Double): Self = StObject.set(x, "ySubscriptXSize", value.asInstanceOf[js.Any])
      
      inline def setYSubscriptYOffset(value: Double): Self = StObject.set(x, "ySubscriptYOffset", value.asInstanceOf[js.Any])
      
      inline def setYSubscriptYSize(value: Double): Self = StObject.set(x, "ySubscriptYSize", value.asInstanceOf[js.Any])
      
      inline def setYSuperscriptXOffset(value: Double): Self = StObject.set(x, "ySuperscriptXOffset", value.asInstanceOf[js.Any])
      
      inline def setYSuperscriptXSize(value: Double): Self = StObject.set(x, "ySuperscriptXSize", value.asInstanceOf[js.Any])
      
      inline def setYSuperscriptYOffset(value: Double): Self = StObject.set(x, "ySuperscriptYOffset", value.asInstanceOf[js.Any])
      
      inline def setYSuperscriptYSize(value: Double): Self = StObject.set(x, "ySuperscriptYSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    /**
      * Gets the exact bounding box of the path by evaluating curve segments.
      * Slower to compute than the control box, but more accurate.
      */
    var bbox: BBOX = js.native
    
    /**
      * Gets the "control box" of a path.
      * This is like the bounding box, but it includes all points including
      * control points of bezier segments and is much faster to compute than
      * the real bounding box.
      */
    var cbox: BBOX = js.native
    
    var commands: js.Array[PathCommand] = js.native
    
    /** Rotates the path by the given angle (in radians) */
    def rotate(angle: Double): this.type = js.native
    
    /** Scales the path */
    def scale(scaleX: Double): this.type = js.native
    def scale(scaleX: Double, scaleY: Double): this.type = js.native
    
    /**
      * Compiles the path to a JavaScript function that can be applied with
      * a graphics context in order to render the path.
      */
    def toFunction(): js.Function1[/* ctx */ CanvasRenderingContext2D, Unit] = js.native
    
    /** Converts the path to an SVG path data string */
    def toSVG(): String = js.native
    
    /** Transforms the path by the given matrix */
    def transform(m0: Double, m1: Double, m2: Double, m3: Double, m4: Double, m5: Double): this.type = js.native
    
    /** Translates the path by the given offset */
    def translate(x: Double, y: Double): this.type = js.native
  }
  
  trait PathCommand extends StObject {
    
    var args: js.Array[Double]
    
    var command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath
  }
  object PathCommand {
    
    inline def apply(args: js.Array[Double], command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): PathCommand = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathCommand] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Double]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Double*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
}
