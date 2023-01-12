package typings.formidable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.formidable.formidableBooleans.`false`
import typings.formidable.formidableMod.^
import typings.formidable.formidableStrings.END
import typings.formidable.formidableStrings.HEADERS_ALMOST_DONE
import typings.formidable.formidableStrings.HEADER_FIELD
import typings.formidable.formidableStrings.HEADER_FIELD_START
import typings.formidable.formidableStrings.HEADER_VALUE
import typings.formidable.formidableStrings.HEADER_VALUE_ALMOST_DONE
import typings.formidable.formidableStrings.HEADER_VALUE_START
import typings.formidable.formidableStrings.PARSER_UNINITIALIZED
import typings.formidable.formidableStrings.PART_DATA
import typings.formidable.formidableStrings.PART_DATA_START
import typings.formidable.formidableStrings.PART_END
import typings.formidable.formidableStrings.START
import typings.formidable.formidableStrings.START_BOUNDARY
import typings.formidable.mod.BufferEncoding
import typings.formidable.mod.DefaultOptions
import typings.formidable.mod.Options
import typings.formidable.mod.Part
import typings.formidable.parsersMod.DummyParser
import typings.formidable.parsersMod.JSONParser
import typings.formidable.parsersMod.MultipartParser
import typings.formidable.parsersMod.OctetStreamParser
import typings.formidable.parsersMod.QuerystringParser
import typings.formidable.parsersMod.StreamingQuerystring
import typings.node.streamMod.Writable
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  FormidableError :typeof FormidableError} & std.Record<'missingPlugin' | 'pluginFunction' | 'aborted' | 'noParser' | 'uninitializedParser' | 'filenameNotString' | 'maxFieldsSizeExceeded' | 'maxFieldsExceeded' | 'smallerThanMinFileSize' | 'biggerThanMaxFileSize' | 'noEmptyFiles' | 'missingContentType' | 'malformedMultipart' | 'missingMultipartBoundary' | 'unknownTransferEncoding', number> */
  trait FormidableErrortypeofForm extends StObject {
    
    var aborted: Double
    
    var biggerThanMaxFileSize: Double
    
    var filenameNotString: Double
    
    var malformedMultipart: Double
    
    var maxFieldsExceeded: Double
    
    var maxFieldsSizeExceeded: Double
    
    var missingContentType: Double
    
    var missingMultipartBoundary: Double
    
    var missingPlugin: Double
    
    var noEmptyFiles: Double
    
    var noParser: Double
    
    var pluginFunction: Double
    
    var smallerThanMinFileSize: Double
    
    var uninitializedParser: Double
    
    var unknownTransferEncoding: Double
  }
  object FormidableErrortypeofForm {
    
    inline def apply(
      aborted: Double,
      biggerThanMaxFileSize: Double,
      filenameNotString: Double,
      malformedMultipart: Double,
      maxFieldsExceeded: Double,
      maxFieldsSizeExceeded: Double,
      missingContentType: Double,
      missingMultipartBoundary: Double,
      missingPlugin: Double,
      noEmptyFiles: Double,
      noParser: Double,
      pluginFunction: Double,
      smallerThanMinFileSize: Double,
      uninitializedParser: Double,
      unknownTransferEncoding: Double
    ): FormidableErrortypeofForm = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], biggerThanMaxFileSize = biggerThanMaxFileSize.asInstanceOf[js.Any], filenameNotString = filenameNotString.asInstanceOf[js.Any], malformedMultipart = malformedMultipart.asInstanceOf[js.Any], maxFieldsExceeded = maxFieldsExceeded.asInstanceOf[js.Any], maxFieldsSizeExceeded = maxFieldsSizeExceeded.asInstanceOf[js.Any], missingContentType = missingContentType.asInstanceOf[js.Any], missingMultipartBoundary = missingMultipartBoundary.asInstanceOf[js.Any], missingPlugin = missingPlugin.asInstanceOf[js.Any], noEmptyFiles = noEmptyFiles.asInstanceOf[js.Any], noParser = noParser.asInstanceOf[js.Any], pluginFunction = pluginFunction.asInstanceOf[js.Any], smallerThanMinFileSize = smallerThanMinFileSize.asInstanceOf[js.Any], uninitializedParser = uninitializedParser.asInstanceOf[js.Any], unknownTransferEncoding = unknownTransferEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormidableErrortypeofForm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormidableErrortypeofForm] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: Double): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setBiggerThanMaxFileSize(value: Double): Self = StObject.set(x, "biggerThanMaxFileSize", value.asInstanceOf[js.Any])
      
      inline def setFilenameNotString(value: Double): Self = StObject.set(x, "filenameNotString", value.asInstanceOf[js.Any])
      
      inline def setMalformedMultipart(value: Double): Self = StObject.set(x, "malformedMultipart", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsExceeded(value: Double): Self = StObject.set(x, "maxFieldsExceeded", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSizeExceeded(value: Double): Self = StObject.set(x, "maxFieldsSizeExceeded", value.asInstanceOf[js.Any])
      
      inline def setMissingContentType(value: Double): Self = StObject.set(x, "missingContentType", value.asInstanceOf[js.Any])
      
      inline def setMissingMultipartBoundary(value: Double): Self = StObject.set(x, "missingMultipartBoundary", value.asInstanceOf[js.Any])
      
      inline def setMissingPlugin(value: Double): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
      
      inline def setNoEmptyFiles(value: Double): Self = StObject.set(x, "noEmptyFiles", value.asInstanceOf[js.Any])
      
      inline def setNoParser(value: Double): Self = StObject.set(x, "noParser", value.asInstanceOf[js.Any])
      
      inline def setPluginFunction(value: Double): Self = StObject.set(x, "pluginFunction", value.asInstanceOf[js.Any])
      
      inline def setSmallerThanMinFileSize(value: Double): Self = StObject.set(x, "smallerThanMinFileSize", value.asInstanceOf[js.Any])
      
      inline def setUninitializedParser(value: Double): Self = StObject.set(x, "uninitializedParser", value.asInstanceOf[js.Any])
      
      inline def setUnknownTransferEncoding(value: Double): Self = StObject.set(x, "unknownTransferEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<formidable.formidable.Options> */
  trait PartialOptions extends StObject {
    
    var allowEmptyFiles: js.UndefOr[Boolean] = js.undefined
    
    var enabledPlugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var fileWriteStreamHandler: js.UndefOr[js.Function0[Writable]] = js.undefined
    
    var filename: js.UndefOr[
        js.Function4[/* name */ String, /* ext */ String, /* part */ Part, /* form */ ^, String]
      ] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* part */ Part, Boolean]] = js.undefined
    
    var hashAlgorithm: js.UndefOr[String | `false`] = js.undefined
    
    var keepExtensions: js.UndefOr[Boolean] = js.undefined
    
    var maxFields: js.UndefOr[Double] = js.undefined
    
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    var maxTotalFileSize: js.UndefOr[Double] = js.undefined
    
    var minFileSize: js.UndefOr[Double] = js.undefined
    
    var multiples: js.UndefOr[Boolean] = js.undefined
    
    var uploadDir: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowEmptyFiles(value: Boolean): Self = StObject.set(x, "allowEmptyFiles", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyFilesUndefined: Self = StObject.set(x, "allowEmptyFiles", js.undefined)
      
      inline def setEnabledPlugins(value: js.Array[String]): Self = StObject.set(x, "enabledPlugins", value.asInstanceOf[js.Any])
      
      inline def setEnabledPluginsUndefined: Self = StObject.set(x, "enabledPlugins", js.undefined)
      
      inline def setEnabledPluginsVarargs(value: String*): Self = StObject.set(x, "enabledPlugins", js.Array(value*))
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFileWriteStreamHandler(value: () => Writable): Self = StObject.set(x, "fileWriteStreamHandler", js.Any.fromFunction0(value))
      
      inline def setFileWriteStreamHandlerUndefined: Self = StObject.set(x, "fileWriteStreamHandler", js.undefined)
      
      inline def setFilename(value: (/* name */ String, /* ext */ String, /* part */ Part, /* form */ ^) => String): Self = StObject.set(x, "filename", js.Any.fromFunction4(value))
      
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
  
  /* Inlined std.Record<'PARSER_UNINITIALIZED' | 'START' | 'START_BOUNDARY' | 'HEADER_FIELD_START' | 'HEADER_FIELD' | 'HEADER_VALUE_START' | 'HEADER_VALUE' | 'HEADER_VALUE_ALMOST_DONE' | 'HEADERS_ALMOST_DONE' | 'PART_DATA_START' | 'PART_DATA' | 'PART_END' | 'END', number> */
  trait RecordPARSERUNINITIALIZED extends StObject {
    
    var END: Double
    
    var HEADERS_ALMOST_DONE: Double
    
    var HEADER_FIELD: Double
    
    var HEADER_FIELD_START: Double
    
    var HEADER_VALUE: Double
    
    var HEADER_VALUE_ALMOST_DONE: Double
    
    var HEADER_VALUE_START: Double
    
    var PARSER_UNINITIALIZED: Double
    
    var PART_DATA: Double
    
    var PART_DATA_START: Double
    
    var PART_END: Double
    
    var START: Double
    
    var START_BOUNDARY: Double
  }
  object RecordPARSERUNINITIALIZED {
    
    inline def apply(
      END: Double,
      HEADERS_ALMOST_DONE: Double,
      HEADER_FIELD: Double,
      HEADER_FIELD_START: Double,
      HEADER_VALUE: Double,
      HEADER_VALUE_ALMOST_DONE: Double,
      HEADER_VALUE_START: Double,
      PARSER_UNINITIALIZED: Double,
      PART_DATA: Double,
      PART_DATA_START: Double,
      PART_END: Double,
      START: Double,
      START_BOUNDARY: Double
    ): RecordPARSERUNINITIALIZED = {
      val __obj = js.Dynamic.literal(END = END.asInstanceOf[js.Any], HEADERS_ALMOST_DONE = HEADERS_ALMOST_DONE.asInstanceOf[js.Any], HEADER_FIELD = HEADER_FIELD.asInstanceOf[js.Any], HEADER_FIELD_START = HEADER_FIELD_START.asInstanceOf[js.Any], HEADER_VALUE = HEADER_VALUE.asInstanceOf[js.Any], HEADER_VALUE_ALMOST_DONE = HEADER_VALUE_ALMOST_DONE.asInstanceOf[js.Any], HEADER_VALUE_START = HEADER_VALUE_START.asInstanceOf[js.Any], PARSER_UNINITIALIZED = PARSER_UNINITIALIZED.asInstanceOf[js.Any], PART_DATA = PART_DATA.asInstanceOf[js.Any], PART_DATA_START = PART_DATA_START.asInstanceOf[js.Any], PART_END = PART_END.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any], START_BOUNDARY = START_BOUNDARY.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordPARSERUNINITIALIZED]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordPARSERUNINITIALIZED] (val x: Self) extends AnyVal {
      
      inline def setEND(value: Double): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
      
      inline def setHEADERS_ALMOST_DONE(value: Double): Self = StObject.set(x, "HEADERS_ALMOST_DONE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FIELD(value: Double): Self = StObject.set(x, "HEADER_FIELD", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FIELD_START(value: Double): Self = StObject.set(x, "HEADER_FIELD_START", value.asInstanceOf[js.Any])
      
      inline def setHEADER_VALUE(value: Double): Self = StObject.set(x, "HEADER_VALUE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_VALUE_ALMOST_DONE(value: Double): Self = StObject.set(x, "HEADER_VALUE_ALMOST_DONE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_VALUE_START(value: Double): Self = StObject.set(x, "HEADER_VALUE_START", value.asInstanceOf[js.Any])
      
      inline def setPARSER_UNINITIALIZED(value: Double): Self = StObject.set(x, "PARSER_UNINITIALIZED", value.asInstanceOf[js.Any])
      
      inline def setPART_DATA(value: Double): Self = StObject.set(x, "PART_DATA", value.asInstanceOf[js.Any])
      
      inline def setPART_DATA_START(value: Double): Self = StObject.set(x, "PART_DATA_START", value.asInstanceOf[js.Any])
      
      inline def setPART_END(value: Double): Self = StObject.set(x, "PART_END", value.asInstanceOf[js.Any])
      
      inline def setSTART(value: Double): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
      
      inline def setSTART_BOUNDARY(value: Double): Self = StObject.set(x, "START_BOUNDARY", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofFormidable extends StObject {
    
    /* static member */
    val DEFAULT_OPTIONS: DefaultOptions
  }
  object TypeofFormidable {
    
    inline def apply(DEFAULT_OPTIONS: DefaultOptions): TypeofFormidable = {
      val __obj = js.Dynamic.literal(DEFAULT_OPTIONS = DEFAULT_OPTIONS.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofFormidable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofFormidable] (val x: Self) extends AnyVal {
      
      inline def setDEFAULT_OPTIONS(value: DefaultOptions): Self = StObject.set(x, "DEFAULT_OPTIONS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMultipartParser
    extends StObject
       with Instantiable0[MultipartParser]
       with Instantiable1[/* options */ PartialOptions, MultipartParser] {
    
    var STATES: RecordPARSERUNINITIALIZED = js.native
    
    def stateToString(stateNumber: Double): String = js.native
  }
  
  @js.native
  trait TypeofMultipartParserInstantiable
    extends StObject
       with Instantiable0[MultipartParser]
       with Instantiable1[/* options */ Partial[Options], MultipartParser] {
    
    var STATES: Record[
        PARSER_UNINITIALIZED | START | START_BOUNDARY | HEADER_FIELD_START | HEADER_FIELD | HEADER_VALUE_START | HEADER_VALUE | HEADER_VALUE_ALMOST_DONE | HEADERS_ALMOST_DONE | PART_DATA_START | PART_DATA | PART_END | END, 
        Double
      ] = js.native
    
    def stateToString(stateNumber: Double): String = js.native
  }
  
  trait Typeofparsers extends StObject {
    
    var DummyParser: Instantiable2[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
        /* options */ js.UndefOr[PartialOptions], 
        typings.formidable.parsersMod.DummyParser
      ]
    
    var JSONParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], typings.formidable.parsersMod.JSONParser]
    
    var MultipartParser: TypeofMultipartParserInstantiable
    
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
  object Typeofparsers {
    
    inline def apply(
      DummyParser: Instantiable2[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
          /* options */ js.UndefOr[PartialOptions], 
          DummyParser
        ],
      JSONParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], JSONParser],
      MultipartParser: TypeofMultipartParserInstantiable,
      OctetStreamParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], OctetStreamParser],
      QuerystringParser: Instantiable1[/* options */ js.UndefOr[PartialOptions], QuerystringParser],
      StreamingQuerystring: Instantiable0[StreamingQuerystring]
    ): Typeofparsers = {
      val __obj = js.Dynamic.literal(DummyParser = DummyParser.asInstanceOf[js.Any], JSONParser = JSONParser.asInstanceOf[js.Any], MultipartParser = MultipartParser.asInstanceOf[js.Any], OctetStreamParser = OctetStreamParser.asInstanceOf[js.Any], QuerystringParser = QuerystringParser.asInstanceOf[js.Any], StreamingQuerystring = StreamingQuerystring.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofparsers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofparsers] (val x: Self) extends AnyVal {
      
      inline def setDummyParser(
        value: Instantiable2[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof IncomingForm */ /* incomingForm */ js.Any, 
              /* options */ js.UndefOr[PartialOptions], 
              DummyParser
            ]
      ): Self = StObject.set(x, "DummyParser", value.asInstanceOf[js.Any])
      
      inline def setJSONParser(value: Instantiable1[/* options */ js.UndefOr[PartialOptions], JSONParser]): Self = StObject.set(x, "JSONParser", value.asInstanceOf[js.Any])
      
      inline def setMultipartParser(value: TypeofMultipartParserInstantiable): Self = StObject.set(x, "MultipartParser", value.asInstanceOf[js.Any])
      
      inline def setOctetStreamParser(value: Instantiable1[/* options */ js.UndefOr[PartialOptions], OctetStreamParser]): Self = StObject.set(x, "OctetStreamParser", value.asInstanceOf[js.Any])
      
      inline def setQuerystringParser(value: Instantiable1[/* options */ js.UndefOr[PartialOptions], QuerystringParser]): Self = StObject.set(x, "QuerystringParser", value.asInstanceOf[js.Any])
      
      inline def setStreamingQuerystring(value: Instantiable0[StreamingQuerystring]): Self = StObject.set(x, "StreamingQuerystring", value.asInstanceOf[js.Any])
    }
  }
}
