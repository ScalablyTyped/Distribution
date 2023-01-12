package typings.formidable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.formidable.anon.FormidableErrortypeofForm
import typings.formidable.anon.PartialOptions
import typings.formidable.anon.TypeofFormidable
import typings.formidable.anon.TypeofMultipartParser
import typings.formidable.anon.Typeofparsers
import typings.formidable.formidableBooleans.`false`
import typings.formidable.formidableStrings.end_
import typings.formidable.formidableStrings.file
import typings.formidable.formidableStrings.fileBegin
import typings.formidable.formidableStrings.json
import typings.formidable.formidableStrings.md5
import typings.formidable.formidableStrings.multipart
import typings.formidable.formidableStrings.octetstream
import typings.formidable.formidableStrings.querystring
import typings.formidable.formidableStrings.sha1
import typings.formidable.formidableStrings.sha256
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {None (options : formidable.formidable.Options | undefined): formidable.formidable/Formidable.^,   defaultOptions :formidable.formidable.DefaultOptions,   enabledPlugins :formidable.formidable.EnabledPlugins,   plugins :formidable.formidable.EnabledPlugins,   errors :{  FormidableError :typeof FormidableError} & std.Record<'missingPlugin' | 'pluginFunction' | 'aborted' | 'noParser' | 'uninitializedParser' | 'filenameNotString' | 'maxFieldsSizeExceeded' | 'maxFieldsExceeded' | 'smallerThanMinFileSize' | 'biggerThanMaxFileSize' | 'noEmptyFiles' | 'missingContentType' | 'malformedMultipart' | 'missingMultipartBoundary' | 'unknownTransferEncoding', number>,   File :new (properties : formidable.formidable.File): formidable.formidable/PersistentFile.^,   PersistentFile :new (properties : formidable.formidable.File): formidable.formidable/PersistentFile.^,   VolatileFile :new (properties : formidable.formidable.File): formidable.formidable/PersistentFile.^,   Formidable :{ readonly DEFAULT_OPTIONS :formidable.formidable.DefaultOptions} & new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/Formidable.^, formidable (options : formidable.formidable.Options | undefined): formidable.formidable/Formidable.^,   IncomingForm :{ readonly DEFAULT_OPTIONS :formidable.formidable.DefaultOptions} & new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/Formidable.^,   parsers :{  MultipartParser :{stateToString (stateNumber : number): string,   STATES :std.Record<'PARSER_UNINITIALIZED' | 'START' | 'START_BOUNDARY' | 'HEADER_FIELD_START' | 'HEADER_FIELD' | 'HEADER_VALUE_START' | 'HEADER_VALUE' | 'HEADER_VALUE_ALMOST_DONE' | 'HEADERS_ALMOST_DONE' | 'PART_DATA_START' | 'PART_DATA' | 'PART_END' | 'END', number>, new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.MultipartParser},   OctetStreamParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.OctetStreamParser,   QuerystringParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.QuerystringParser,   StreamingQuerystring :new (): formidable.formidable/parsers.StreamingQuerystring,   DummyParser :new (incomingForm : typeof IncomingForm, options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.DummyParser,   JSONParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.JSONParser}} & formidable.formidable.MappedParsers */
object mod {
  
  inline def apply(): typings.formidable.formidableMod.^ = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.formidable.formidableMod.^]
  inline def apply(options: Options): typings.formidable.formidableMod.^ = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.formidable.formidableMod.^]
  
  @JSImport("formidable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "DummyParser")
  @js.native
  open class DummyParser protected ()
    extends typings.formidable.parsersMod.DummyParser {
    def this(incomingForm: /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ js.Any) = this()
    def this(
      incomingForm: /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ js.Any,
      options: PartialOptions
    ) = this()
  }
  @JSImport("formidable", "DummyParser")
  @js.native
  def DummyParser: Instantiable2[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
    /* options */ js.UndefOr[PartialOptions], 
    typings.formidable.parsersMod.DummyParser
  ] = js.native
  inline def DummyParser_=(
    x: Instantiable2[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
      /* options */ js.UndefOr[PartialOptions], 
      typings.formidable.parsersMod.DummyParser
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DummyParser")(x.asInstanceOf[js.Any])
  
  trait File extends StObject {
    
    /**
      * The path this file is being written to. You can modify this in the `'fileBegin'` event in case
      * you are unhappy with the way formidable generates a temporary path for your files.
      */
    var filepath: String
    
    /**
      * If `options.hashAlgorithm` calculation was set, you can read the hex digest out of this var
      * (at the end it will be a string).
      */
    var hash: js.UndefOr[String | Null] = js.undefined
    
    var hashAlgorithm: `false` | sha1 | md5 | sha256
    
    /**
      * The mime type of this file, according to the uploading client.
      */
    var mimetype: String | Null
    
    /**
      * A Date object (or `null`) containing the time this file was last written to. Mostly here for
      * compatibility with the [W3C File API Draft](http://dev.w3.org/2006/webapi/FileAPI/).
      */
    var mtime: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * Calculated based on options provided
      */
    var newFilename: String
    
    /**
      * The name this file had according to the uploading client.
      */
    var originalFilename: String | Null
    
    /**
      * The size of the uploaded file in bytes. If the file is still being uploaded (see `'fileBegin'`
      * event), this property says how many bytes of the file have been written to disk yet.
      */
    var size: Double
    
    /**
      * This method returns a JSON-representation of the file, allowing you to JSON.stringify() the
      * file which is useful for logging and responding to requests.
      *
      * @link https://github.com/node-formidable/formidable#filetojson
      */
    def toJSON(): FileJSON
  }
  object File {
    
    @JSImport("formidable", "File")
    @js.native
    val ^ : Instantiable1[/* properties */ File, typings.formidable.persistentFileMod.^] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithm(value: `false` | sha1 | md5 | sha256): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeNull: Self = StObject.set(x, "mimetype", null)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNull: Self = StObject.set(x, "mtime", null)
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setNewFilename(value: String): Self = StObject.set(x, "newFilename", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilenameNull: Self = StObject.set(x, "originalFilename", null)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => FileJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("formidable", "File")
  @js.native
  open class FileCls protected ()
    extends typings.formidable.persistentFileMod.^ {
    def this(properties: File) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "Formidable")
  @js.native
  open class Formidable ()
    extends typings.formidable.formidableMod.^ {
    def this(options: PartialOptions) = this()
  }
  @JSImport("formidable", "Formidable")
  @js.native
  def Formidable_ : TypeofFormidable & (Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.formidableMod.^]) = js.native
  
  inline def Formidable__=(
    x: TypeofFormidable & (Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.formidableMod.^])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Formidable")(x.asInstanceOf[js.Any])
  
  // alias
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "IncomingForm")
  @js.native
  open class IncomingForm ()
    extends typings.formidable.formidableMod.^ {
    def this(options: PartialOptions) = this()
  }
  // alias
  @JSImport("formidable", "IncomingForm")
  @js.native
  def IncomingForm: TypeofFormidable & (Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.formidableMod.^]) = js.native
  inline def IncomingForm_=(
    x: TypeofFormidable & (Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.formidableMod.^])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncomingForm")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "JSONParser")
  @js.native
  open class JSONParser ()
    extends typings.formidable.parsersMod.JSONParser {
    def this(options: PartialOptions) = this()
  }
  @JSImport("formidable", "JSONParser")
  @js.native
  def JSONParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.parsersMod.JSONParser] = js.native
  inline def JSONParser_=(
    x: Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.parsersMod.JSONParser]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSONParser")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "MultipartParser")
  @js.native
  open class MultipartParser ()
    extends typings.formidable.parsersMod.MultipartParser {
    def this(options: PartialOptions) = this()
  }
  @JSImport("formidable", "MultipartParser")
  @js.native
  def MultipartParser: TypeofMultipartParser = js.native
  inline def MultipartParser_=(x: TypeofMultipartParser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultipartParser")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "OctetStreamParser")
  @js.native
  open class OctetStreamParser ()
    extends typings.formidable.parsersMod.OctetStreamParser {
    def this(options: PartialOptions) = this()
  }
  @JSImport("formidable", "OctetStreamParser")
  @js.native
  def OctetStreamParser: Instantiable1[
    /* options */ js.UndefOr[PartialOptions], 
    typings.formidable.parsersMod.OctetStreamParser
  ] = js.native
  inline def OctetStreamParser_=(
    x: Instantiable1[
      /* options */ js.UndefOr[PartialOptions], 
      typings.formidable.parsersMod.OctetStreamParser
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OctetStreamParser")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "PersistentFile")
  @js.native
  open class PersistentFile protected ()
    extends typings.formidable.persistentFileMod.^ {
    def this(properties: File) = this()
  }
  @JSImport("formidable", "PersistentFile")
  @js.native
  def PersistentFile: Instantiable1[/* properties */ File, typings.formidable.persistentFileMod.^] = js.native
  inline def PersistentFile_=(x: Instantiable1[/* properties */ File, typings.formidable.persistentFileMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PersistentFile")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "QuerystringParser")
  @js.native
  open class QuerystringParser ()
    extends typings.formidable.parsersMod.QuerystringParser {
    def this(options: PartialOptions) = this()
  }
  @JSImport("formidable", "QuerystringParser")
  @js.native
  def QuerystringParser: Instantiable1[
    /* options */ js.UndefOr[PartialOptions], 
    typings.formidable.parsersMod.QuerystringParser
  ] = js.native
  inline def QuerystringParser_=(
    x: Instantiable1[
      /* options */ js.UndefOr[PartialOptions], 
      typings.formidable.parsersMod.QuerystringParser
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuerystringParser")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "StreamingQuerystring")
  @js.native
  open class StreamingQuerystring ()
    extends typings.formidable.parsersMod.StreamingQuerystring
  @JSImport("formidable", "StreamingQuerystring")
  @js.native
  def StreamingQuerystring: Instantiable0[typings.formidable.parsersMod.StreamingQuerystring] = js.native
  inline def StreamingQuerystring_=(x: Instantiable0[typings.formidable.parsersMod.StreamingQuerystring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StreamingQuerystring")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formidable", "VolatileFile")
  @js.native
  open class VolatileFile protected ()
    extends typings.formidable.persistentFileMod.^ {
    def this(properties: File) = this()
  }
  @JSImport("formidable", "VolatileFile")
  @js.native
  def VolatileFile: Instantiable1[/* properties */ File, typings.formidable.persistentFileMod.^] = js.native
  inline def VolatileFile_=(x: Instantiable1[/* properties */ File, typings.formidable.persistentFileMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VolatileFile")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable", "defaultOptions")
  @js.native
  def defaultOptions: DefaultOptions = js.native
  inline def defaultOptions_=(x: DefaultOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable", "enabledPlugins")
  @js.native
  def enabledPlugins: EnabledPlugins = js.native
  inline def enabledPlugins_=(x: EnabledPlugins): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabledPlugins")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable", "errors")
  @js.native
  def errors: FormidableErrortypeofForm = js.native
  inline def errors_=(x: FormidableErrortypeofForm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errors")(x.asInstanceOf[js.Any])
  
  inline def formidable(): typings.formidable.formidableMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("formidable")().asInstanceOf[typings.formidable.formidableMod.^]
  inline def formidable(options: Options): typings.formidable.formidableMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("formidable")(options.asInstanceOf[js.Any]).asInstanceOf[typings.formidable.formidableMod.^]
  
  // parsers and mapped parsers
  @JSImport("formidable", "parsers")
  @js.native
  def parsers: Typeofparsers = js.native
  inline def parsers_=(x: Typeofparsers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
  
  @JSImport("formidable", "plugins")
  @js.native
  def plugins: EnabledPlugins = js.native
  inline def plugins_=(x: EnabledPlugins): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.formidable.formidableStrings.ascii
    - typings.formidable.formidableStrings.base64
    - typings.formidable.formidableStrings.binary
    - typings.formidable.formidableStrings.hex
    - typings.formidable.formidableStrings.latin1
    - typings.formidable.formidableStrings.`ucs-2`
    - typings.formidable.formidableStrings.ucs2
    - typings.formidable.formidableStrings.`utf-8`
    - typings.formidable.formidableStrings.utf16le
    - typings.formidable.formidableStrings.utf8
  */
  trait BufferEncoding extends StObject
  object BufferEncoding {
    
    inline def ascii: typings.formidable.formidableStrings.ascii = "ascii".asInstanceOf[typings.formidable.formidableStrings.ascii]
    
    inline def base64: typings.formidable.formidableStrings.base64 = "base64".asInstanceOf[typings.formidable.formidableStrings.base64]
    
    inline def binary: typings.formidable.formidableStrings.binary = "binary".asInstanceOf[typings.formidable.formidableStrings.binary]
    
    inline def hex: typings.formidable.formidableStrings.hex = "hex".asInstanceOf[typings.formidable.formidableStrings.hex]
    
    inline def latin1: typings.formidable.formidableStrings.latin1 = "latin1".asInstanceOf[typings.formidable.formidableStrings.latin1]
    
    inline def `ucs-2`: typings.formidable.formidableStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.formidable.formidableStrings.`ucs-2`]
    
    inline def ucs2: typings.formidable.formidableStrings.ucs2 = "ucs2".asInstanceOf[typings.formidable.formidableStrings.ucs2]
    
    inline def `utf-8`: typings.formidable.formidableStrings.`utf-8` = "utf-8".asInstanceOf[typings.formidable.formidableStrings.`utf-8`]
    
    inline def utf16le: typings.formidable.formidableStrings.utf16le = "utf16le".asInstanceOf[typings.formidable.formidableStrings.utf16le]
    
    inline def utf8: typings.formidable.formidableStrings.utf8 = "utf8".asInstanceOf[typings.formidable.formidableStrings.utf8]
  }
  
  /* Inlined std.Required<std.Omit<formidable.formidable.Options, 'enabledPlugins'>> & {  enabledPlugins :formidable.formidable.EnabledPlugins} */
  trait DefaultOptions extends StObject {
    
    var allowEmptyFiles: Boolean
    
    var enabledPlugins: EnabledPlugins
    
    var encoding: BufferEncoding
    
    def fileWriteStreamHandler(): Writable
    @JSName("fileWriteStreamHandler")
    var fileWriteStreamHandler_Original: js.Function0[Writable]
    
    def filename(name: String, ext: String, part: Part, form: typings.formidable.formidableMod.^): String
    @JSName("filename")
    var filename_Original: js.Function4[
        /* name */ String, 
        /* ext */ String, 
        /* part */ Part, 
        /* form */ typings.formidable.formidableMod.^, 
        String
      ]
    
    def filter(part: Part): Boolean
    @JSName("filter")
    var filter_Original: js.Function1[/* part */ Part, Boolean]
    
    var hashAlgorithm: String | `false`
    
    var keepExtensions: Boolean
    
    var maxFields: Double
    
    var maxFieldsSize: Double
    
    var maxFileSize: Double
    
    var maxFiles: Double
    
    var maxTotalFileSize: Double
    
    var minFileSize: Double
    
    var multiples: Boolean
    
    var uploadDir: String
  }
  object DefaultOptions {
    
    inline def apply(
      allowEmptyFiles: Boolean,
      enabledPlugins: EnabledPlugins,
      encoding: BufferEncoding,
      fileWriteStreamHandler: () => Writable,
      filename: (/* name */ String, /* ext */ String, /* part */ Part, /* form */ typings.formidable.formidableMod.^) => String,
      filter: /* part */ Part => Boolean,
      hashAlgorithm: String | `false`,
      keepExtensions: Boolean,
      maxFields: Double,
      maxFieldsSize: Double,
      maxFileSize: Double,
      maxFiles: Double,
      maxTotalFileSize: Double,
      minFileSize: Double,
      multiples: Boolean,
      uploadDir: String
    ): DefaultOptions = {
      val __obj = js.Dynamic.literal(allowEmptyFiles = allowEmptyFiles.asInstanceOf[js.Any], enabledPlugins = enabledPlugins.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fileWriteStreamHandler = js.Any.fromFunction0(fileWriteStreamHandler), filename = js.Any.fromFunction4(filename), filter = js.Any.fromFunction1(filter), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], keepExtensions = keepExtensions.asInstanceOf[js.Any], maxFields = maxFields.asInstanceOf[js.Any], maxFieldsSize = maxFieldsSize.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any], maxFiles = maxFiles.asInstanceOf[js.Any], maxTotalFileSize = maxTotalFileSize.asInstanceOf[js.Any], minFileSize = minFileSize.asInstanceOf[js.Any], multiples = multiples.asInstanceOf[js.Any], uploadDir = uploadDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowEmptyFiles(value: Boolean): Self = StObject.set(x, "allowEmptyFiles", value.asInstanceOf[js.Any])
      
      inline def setEnabledPlugins(value: EnabledPlugins): Self = StObject.set(x, "enabledPlugins", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFileWriteStreamHandler(value: () => Writable): Self = StObject.set(x, "fileWriteStreamHandler", js.Any.fromFunction0(value))
      
      inline def setFilename(
        value: (/* name */ String, /* ext */ String, /* part */ Part, /* form */ typings.formidable.formidableMod.^) => String
      ): Self = StObject.set(x, "filename", js.Any.fromFunction4(value))
      
      inline def setFilter(value: /* part */ Part => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setHashAlgorithm(value: String | `false`): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      inline def setMaxFields(value: Double): Self = StObject.set(x, "maxFields", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalFileSize(value: Double): Self = StObject.set(x, "maxTotalFileSize", value.asInstanceOf[js.Any])
      
      inline def setMinFileSize(value: Double): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
      
      inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmitData extends StObject {
    
    var formname: Any
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var name: fileBegin | file
    
    var value: File | String
  }
  object EmitData {
    
    inline def apply(formname: Any, name: fileBegin | file, value: File | String): EmitData = {
      val __obj = js.Dynamic.literal(formname = formname.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmitData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmitData] (val x: Self) extends AnyVal {
      
      inline def setFormname(value: Any): Self = StObject.set(x, "formname", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setName(value: fileBegin | file): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: File | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in formidable.formidable.Plugin ]: formidable.formidable.PluginFunction}
    }}}
    */
  @js.native
  trait EnabledPlugins extends StObject
  
  trait EventData extends StObject {
    
    var buffer: String
    
    var end: String
    
    var formname: String
    
    var key: String
    
    var name: EventNames
    
    var start: String
    
    var value: String
  }
  object EventData {
    
    inline def apply(
      buffer: String,
      end: String,
      formname: String,
      key: String,
      name: EventNames,
      start: String,
      value: String
    ): EventData = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], formname = formname.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFormname(value: String): Self = StObject.set(x, "formname", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: EventNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formidable.formidableStrings.aborted
    - typings.formidable.formidableStrings.end_
    - typings.formidable.formidableStrings.error
    - typings.formidable.formidableStrings.field
    - typings.formidable.formidableStrings.file
    - typings.formidable.formidableStrings.fileBegin
    - typings.formidable.formidableStrings.headerEnd
    - typings.formidable.formidableStrings.headerField
    - typings.formidable.formidableStrings.headersEnd
    - typings.formidable.formidableStrings.headerValue
    - typings.formidable.formidableStrings.partBegin
    - typings.formidable.formidableStrings.partData
    - typings.formidable.formidableStrings.progress
  */
  trait EventNames extends StObject
  object EventNames {
    
    inline def aborted: typings.formidable.formidableStrings.aborted = "aborted".asInstanceOf[typings.formidable.formidableStrings.aborted]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def error: typings.formidable.formidableStrings.error = "error".asInstanceOf[typings.formidable.formidableStrings.error]
    
    inline def field: typings.formidable.formidableStrings.field = "field".asInstanceOf[typings.formidable.formidableStrings.field]
    
    inline def file: typings.formidable.formidableStrings.file = "file".asInstanceOf[typings.formidable.formidableStrings.file]
    
    inline def fileBegin: typings.formidable.formidableStrings.fileBegin = "fileBegin".asInstanceOf[typings.formidable.formidableStrings.fileBegin]
    
    inline def headerEnd: typings.formidable.formidableStrings.headerEnd = "headerEnd".asInstanceOf[typings.formidable.formidableStrings.headerEnd]
    
    inline def headerField: typings.formidable.formidableStrings.headerField = "headerField".asInstanceOf[typings.formidable.formidableStrings.headerField]
    
    inline def headerValue: typings.formidable.formidableStrings.headerValue = "headerValue".asInstanceOf[typings.formidable.formidableStrings.headerValue]
    
    inline def headersEnd: typings.formidable.formidableStrings.headersEnd = "headersEnd".asInstanceOf[typings.formidable.formidableStrings.headersEnd]
    
    inline def partBegin: typings.formidable.formidableStrings.partBegin = "partBegin".asInstanceOf[typings.formidable.formidableStrings.partBegin]
    
    inline def partData: typings.formidable.formidableStrings.partData = "partData".asInstanceOf[typings.formidable.formidableStrings.partData]
    
    inline def progress: typings.formidable.formidableStrings.progress = "progress".asInstanceOf[typings.formidable.formidableStrings.progress]
  }
  
  type Fields = StringDictionary[String | js.Array[String]]
  
  /**
    * @link https://github.com/node-formidable/formidable#file
    */
  /* Inlined parent std.Pick<formidable.formidable.File, 'size' | 'filepath' | 'originalFilename' | 'mimetype' | 'hash'> */
  trait FileJSON extends StObject {
    
    var filepath: String
    
    var hash: js.UndefOr[String | Null] = js.undefined
    
    var length: Double
    
    var mimetype: String | Null
    
    var mtime: js.Date | Null
    
    var originalFilename: String | Null
    
    var size: Double
  }
  object FileJSON {
    
    inline def apply(filepath: String, length: Double, size: Double): FileJSON = {
      val __obj = js.Dynamic.literal(filepath = filepath.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], mimetype = null, mtime = null, originalFilename = null)
      __obj.asInstanceOf[FileJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileJSON] (val x: Self) extends AnyVal {
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeNull: Self = StObject.set(x, "mimetype", null)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNull: Self = StObject.set(x, "mtime", null)
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilenameNull: Self = StObject.set(x, "originalFilename", null)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type Files = StringDictionary[File | js.Array[File]]
  
  /* Inlined {[ P in keyof {  MultipartParser :{stateToString (stateNumber : number): string,   STATES :std.Record<'PARSER_UNINITIALIZED' | 'START' | 'START_BOUNDARY' | 'HEADER_FIELD_START' | 'HEADER_FIELD' | 'HEADER_VALUE_START' | 'HEADER_VALUE' | 'HEADER_VALUE_ALMOST_DONE' | 'HEADERS_ALMOST_DONE' | 'PART_DATA_START' | 'PART_DATA' | 'PART_END' | 'END', number>, new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.MultipartParser},   OctetStreamParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.OctetStreamParser,   QuerystringParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.QuerystringParser,   StreamingQuerystring :new (): formidable.formidable/parsers.StreamingQuerystring,   DummyParser :new (incomingForm : typeof IncomingForm, options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.DummyParser,   JSONParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.JSONParser} ]: {  MultipartParser :{stateToString (stateNumber : number): string,   STATES :std.Record<'PARSER_UNINITIALIZED' | 'START' | 'START_BOUNDARY' | 'HEADER_FIELD_START' | 'HEADER_FIELD' | 'HEADER_VALUE_START' | 'HEADER_VALUE' | 'HEADER_VALUE_ALMOST_DONE' | 'HEADERS_ALMOST_DONE' | 'PART_DATA_START' | 'PART_DATA' | 'PART_END' | 'END', number>, new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.MultipartParser},   OctetStreamParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.OctetStreamParser,   QuerystringParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.QuerystringParser,   StreamingQuerystring :new (): formidable.formidable/parsers.StreamingQuerystring,   DummyParser :new (incomingForm : typeof IncomingForm, options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.DummyParser,   JSONParser :new (options : std.Partial<formidable.formidable.Options> | undefined): formidable.formidable/parsers.JSONParser}[P]} */
  trait MappedParsers extends StObject {
    
    var DummyParser: Instantiable2[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
        /* options */ js.UndefOr[PartialOptions], 
        typings.formidable.parsersMod.DummyParser
      ]
    
    var JSONParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.parsersMod.JSONParser]
    
    var MultipartParser: TypeofMultipartParser
    
    var OctetStreamParser: Instantiable1[
        /* options */ js.UndefOr[PartialOptions], 
        typings.formidable.parsersMod.OctetStreamParser
      ]
    
    var QuerystringParser: Instantiable1[
        /* options */ js.UndefOr[PartialOptions], 
        typings.formidable.parsersMod.QuerystringParser
      ]
    
    var StreamingQuerystring: Instantiable0[typings.formidable.parsersMod.StreamingQuerystring]
  }
  object MappedParsers {
    
    inline def apply(
      DummyParser: Instantiable2[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
          /* options */ js.UndefOr[PartialOptions], 
          typings.formidable.parsersMod.DummyParser
        ],
      JSONParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.parsersMod.JSONParser],
      MultipartParser: TypeofMultipartParser,
      OctetStreamParser: Instantiable1[
          /* options */ js.UndefOr[PartialOptions], 
          typings.formidable.parsersMod.OctetStreamParser
        ],
      QuerystringParser: Instantiable1[
          /* options */ js.UndefOr[PartialOptions], 
          typings.formidable.parsersMod.QuerystringParser
        ],
      StreamingQuerystring: Instantiable0[typings.formidable.parsersMod.StreamingQuerystring]
    ): MappedParsers = {
      val __obj = js.Dynamic.literal(DummyParser = DummyParser.asInstanceOf[js.Any], JSONParser = JSONParser.asInstanceOf[js.Any], MultipartParser = MultipartParser.asInstanceOf[js.Any], OctetStreamParser = OctetStreamParser.asInstanceOf[js.Any], QuerystringParser = QuerystringParser.asInstanceOf[js.Any], StreamingQuerystring = StreamingQuerystring.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappedParsers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappedParsers] (val x: Self) extends AnyVal {
      
      inline def setDummyParser(
        value: Instantiable2[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
              /* options */ js.UndefOr[PartialOptions], 
              typings.formidable.parsersMod.DummyParser
            ]
      ): Self = StObject.set(x, "DummyParser", value.asInstanceOf[js.Any])
      
      inline def setJSONParser(
        value: Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.parsersMod.JSONParser]
      ): Self = StObject.set(x, "JSONParser", value.asInstanceOf[js.Any])
      
      inline def setMultipartParser(value: TypeofMultipartParser): Self = StObject.set(x, "MultipartParser", value.asInstanceOf[js.Any])
      
      inline def setOctetStreamParser(
        value: Instantiable1[
              /* options */ js.UndefOr[PartialOptions], 
              typings.formidable.parsersMod.OctetStreamParser
            ]
      ): Self = StObject.set(x, "OctetStreamParser", value.asInstanceOf[js.Any])
      
      inline def setQuerystringParser(
        value: Instantiable1[
              /* options */ js.UndefOr[PartialOptions], 
              typings.formidable.parsersMod.QuerystringParser
            ]
      ): Self = StObject.set(x, "QuerystringParser", value.asInstanceOf[js.Any])
      
      inline def setStreamingQuerystring(value: Instantiable0[typings.formidable.parsersMod.StreamingQuerystring]): Self = StObject.set(x, "StreamingQuerystring", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * allow upload empty files
      *
      * @default true
      */
    var allowEmptyFiles: js.UndefOr[Boolean] = js.undefined
    
    var enabledPlugins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * sets encoding for incoming form fields
      *
      * @default 'utf-8'
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * which by default writes to host machine file system every file parsed; The function should
      * return an instance of a Writable stream that will receive the uploaded file data. With this
      * option, you can have any custom behavior regarding where the uploaded file data will be
      * streamed for. If you are looking to write the file uploaded in other types of cloud storages
      * (AWS S3, Azure blob storage, Google cloud storage) or private file storage, this is the option
      * you're looking for. When this option is defined the default behavior of writing the file in the
      * host machine file system is lost.
      *
      * @default null
      */
    var fileWriteStreamHandler: js.UndefOr[js.Function0[Writable]] = js.undefined
    
    /**
      * Use it to control newFilename. Must return a string. Will be joined with
      * options.uploadDir.
      *
      * @default undefined
      */
    var filename: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* ext */ String, 
          /* part */ Part, 
          /* form */ typings.formidable.formidableMod.^, 
          String
        ]
      ] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* part */ Part, Boolean]] = js.undefined
    
    /**
      * include checksums calculated for incoming files, set this to some hash algorithm, see
      * crypto.createHash for available algorithms
      *
      * @default false
      */
    var hashAlgorithm: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * to include the extensions of the original files or not
      *
      * @default false
      */
    var keepExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * limit the number of fields, set 0 for unlimited
      *
      * @default 1000
      */
    var maxFields: js.UndefOr[Double] = js.undefined
    
    /**
      * limit the amount of memory all fields together (except files) can allocate in bytes
      *
      * @default 20 * 1024 * 1024
      */
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    /**
      * limit the size of uploaded file
      *
      * @default 200 * 1024 * 1024
      */
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * limit the amount of uploaded files, set Infinity for unlimited
      *
      * @default Infinity
      */
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    /**
      * limit the size of the batch of uploaded files
      *
      * @default options.maxFileSize
      */
    var maxTotalFileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * the minium size of uploaded file
      *
      * @default 1
      */
    var minFileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * when you call the .parse method, the files argument (of the callback) will contain arrays of
      * files for inputs which submit multiple files using the HTML5 multiple attribute. Also, the
      * fields argument will contain arrays of values for fields that have names ending with '[]'
      *
      * @default false
      */
    var multiples: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the directory for placing file uploads in. You can move them later by using fs.rename()
      *
      * @default os.tmpdir()
      */
    var uploadDir: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowEmptyFiles(value: Boolean): Self = StObject.set(x, "allowEmptyFiles", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyFilesUndefined: Self = StObject.set(x, "allowEmptyFiles", js.undefined)
      
      inline def setEnabledPlugins(value: js.Array[String]): Self = StObject.set(x, "enabledPlugins", value.asInstanceOf[js.Any])
      
      inline def setEnabledPluginsUndefined: Self = StObject.set(x, "enabledPlugins", js.undefined)
      
      inline def setEnabledPluginsVarargs(value: String*): Self = StObject.set(x, "enabledPlugins", js.Array(value*))
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFileWriteStreamHandler(value: () => Writable): Self = StObject.set(x, "fileWriteStreamHandler", js.Any.fromFunction0(value))
      
      inline def setFileWriteStreamHandlerUndefined: Self = StObject.set(x, "fileWriteStreamHandler", js.undefined)
      
      inline def setFilename(
        value: (/* name */ String, /* ext */ String, /* part */ Part, /* form */ typings.formidable.formidableMod.^) => String
      ): Self = StObject.set(x, "filename", js.Any.fromFunction4(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilter(value: /* part */ Part => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHashAlgorithm(value: String | `false`): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
      
      inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      inline def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      inline def setMaxFields(value: Double): Self = StObject.set(x, "maxFields", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      inline def setMaxFieldsUndefined: Self = StObject.set(x, "maxFields", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMaxTotalFileSize(value: Double): Self = StObject.set(x, "maxTotalFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalFileSizeUndefined: Self = StObject.set(x, "maxTotalFileSize", js.undefined)
      
      inline def setMinFileSize(value: Double): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
      
      inline def setMinFileSizeUndefined: Self = StObject.set(x, "minFileSize", js.undefined)
      
      inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      inline def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
    }
  }
  
  @js.native
  trait Part extends Stream {
    
    var mimetype: String | Null = js.native
    
    var name: String | Null = js.native
    
    var originalFilename: String | Null = js.native
  }
  
  type Plugin = /* keyof {[ K in formidable.formidable.Plugins[number] ]: K} */ String
  
  type PluginFunction = js.Function2[
    /* formidable */ typings.formidable.formidableMod.^, 
    /* options */ PartialOptions, 
    Unit
  ]
  
  type Plugins = js.Tuple4[octetstream, querystring, multipart, json]
}
