package typings.exceljs.mod

import typings.exceljs.anon.PartialArchiverZipOptions
import typings.exceljs.anon.PartialWorkbookStreamRead
import typings.exceljs.anon.PartialWorkbookStreamWrit
import typings.exceljs.anon.PartialZlibOptions
import typings.exceljs.exceljsStrings.cache
import typings.exceljs.exceljsStrings.emit
import typings.exceljs.exceljsStrings.ignore
import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Stream
import typings.std.ArrayBuffer
import typings.std.AsyncIterator
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stream {
  
  object xlsx {
    
    @JSImport("exceljs", "stream.xlsx.WorkbookReader")
    @js.native
    class WorkbookReader protected () extends Workbook {
      def this(input: String, options: PartialWorkbookStreamRead) = this()
      def this(input: Stream, options: PartialWorkbookStreamRead) = this()
      
      def parse(): AsyncIterator[_, _, js.UndefOr[scala.Nothing]] = js.native
      
      def read(): js.Promise[Unit] = js.native
    }
    
    @JSImport("exceljs", "stream.xlsx.WorkbookWriter")
    @js.native
    class WorkbookWriter protected () extends Workbook {
      def this(options: PartialWorkbookStreamWrit) = this()
      
      def addApp(): js.Promise[Unit] = js.native
      
      def addContentTypes(): js.Promise[Unit] = js.native
      
      def addCore(): js.Promise[Unit] = js.native
      
      def addOfficeRels(): js.Promise[Unit] = js.native
      
      def addSharedStrings(): js.Promise[Unit] = js.native
      
      def addStyles(): js.Promise[Unit] = js.native
      
      def addThemes(): js.Promise[Unit] = js.native
      
      def addWorkbook(): js.Promise[Unit] = js.native
      
      def addWorkbookRels(): js.Promise[Unit] = js.native
      
      // commit all worksheets, then add suplimentary files
      def commit(): js.Promise[Unit] = js.native
    }
    
    @JSImport("exceljs", "stream.xlsx.WorksheetReader")
    @js.native
    class WorksheetReader protected () extends StObject {
      def this(options: WorksheetReaderOptions) = this()
      
      def columns(): Double = js.native
      
      def dimensions(): Double = js.native
      
      def getColumn(c: Double): Column = js.native
      
      def parse(): AsyncIterator[js.Array[_], _, js.UndefOr[scala.Nothing]] = js.native
      
      def read(): js.Promise[Unit] = js.native
    }
    
    @js.native
    trait ArchiverZipOptions extends StObject {
      
      var comment: String = js.native
      
      var forceLocalTime: Boolean = js.native
      
      var forceZip64: Boolean = js.native
      
      var store: Boolean = js.native
      
      var zlib: PartialZlibOptions = js.native
    }
    object ArchiverZipOptions {
      
      @scala.inline
      def apply(
        comment: String,
        forceLocalTime: Boolean,
        forceZip64: Boolean,
        store: Boolean,
        zlib: PartialZlibOptions
      ): ArchiverZipOptions = {
        val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], forceLocalTime = forceLocalTime.asInstanceOf[js.Any], forceZip64 = forceZip64.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
        __obj.asInstanceOf[ArchiverZipOptions]
      }
      
      @scala.inline
      implicit class ArchiverZipOptionsMutableBuilder[Self <: ArchiverZipOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceLocalTime(value: Boolean): Self = StObject.set(x, "forceLocalTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceZip64(value: Boolean): Self = StObject.set(x, "forceZip64", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZlib(value: PartialZlibOptions): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WorkbookStreamReaderOptions extends StObject {
      
      /**
      			 * @default 'ignore'
      			 */
      var entries: js.UndefOr[emit | ignore] = js.native
      
      /**
      			 * @default 'ignore'
      			 */
      var hyperlinks: js.UndefOr[cache | emit | ignore] = js.native
      
      /**
      			 * @default 'cache'
      			 */
      var sharedStrings: js.UndefOr[cache | emit | ignore] = js.native
      
      /**
      			 * @default 'ignore'
      			 */
      var styles: js.UndefOr[cache | ignore] = js.native
      
      /**
      			 * @default 'emit'
      			 */
      var worksheets: js.UndefOr[emit | ignore] = js.native
    }
    object WorkbookStreamReaderOptions {
      
      @scala.inline
      def apply(): WorkbookStreamReaderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WorkbookStreamReaderOptions]
      }
      
      @scala.inline
      implicit class WorkbookStreamReaderOptionsMutableBuilder[Self <: WorkbookStreamReaderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEntries(value: emit | ignore): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
        
        @scala.inline
        def setHyperlinks(value: cache | emit | ignore): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
        
        @scala.inline
        def setSharedStrings(value: cache | emit | ignore): Self = StObject.set(x, "sharedStrings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSharedStringsUndefined: Self = StObject.set(x, "sharedStrings", js.undefined)
        
        @scala.inline
        def setStyles(value: cache | ignore): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        @scala.inline
        def setWorksheets(value: emit | ignore): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
      }
    }
    
    @js.native
    trait WorkbookStreamWriterOptions extends WorkbookWriterOptions {
      
      /**
      			 * Specifies whether to add style information to the workbook.
      			 * Styles can add some performance overhead. Default is false
      			 */
      var zip: PartialArchiverZipOptions = js.native
    }
    object WorkbookStreamWriterOptions {
      
      @scala.inline
      def apply(
        filename: String,
        stream: Stream,
        useSharedStrings: Boolean,
        useStyles: Boolean,
        zip: PartialArchiverZipOptions
      ): WorkbookStreamWriterOptions = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkbookStreamWriterOptions]
      }
      
      @scala.inline
      implicit class WorkbookStreamWriterOptionsMutableBuilder[Self <: WorkbookStreamWriterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setZip(value: PartialArchiverZipOptions): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WorkbookWriterOptions extends StObject {
      
      /**
      			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
      			 */
      var filename: String = js.native
      
      /**
      			 * Specifies a writable stream to write the XLSX workbook to.
      			 */
      var stream: Stream = js.native
      
      /**
      			 * 	Specifies whether to use shared strings in the workbook. Default is false
      			 */
      var useSharedStrings: Boolean = js.native
      
      /**
      			 * Specifies whether to add style information to the workbook.
      			 * Styles can add some performance overhead. Default is false
      			 */
      var useStyles: Boolean = js.native
    }
    object WorkbookWriterOptions {
      
      @scala.inline
      def apply(filename: String, stream: Stream, useSharedStrings: Boolean, useStyles: Boolean): WorkbookWriterOptions = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkbookWriterOptions]
      }
      
      @scala.inline
      implicit class WorkbookWriterOptionsMutableBuilder[Self <: WorkbookWriterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseSharedStrings(value: Boolean): Self = StObject.set(x, "useSharedStrings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseStyles(value: Boolean): Self = StObject.set(x, "useStyles", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WorksheetReaderOptions extends StObject {
      
      var entry: Stream = js.native
      
      var id: Double = js.native
      
      var options: WorkbookStreamReaderOptions = js.native
      
      var workbook: Workbook = js.native
    }
    object WorksheetReaderOptions {
      
      @scala.inline
      def apply(entry: Stream, id: Double, options: WorkbookStreamReaderOptions, workbook: Workbook): WorksheetReaderOptions = {
        val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], workbook = workbook.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorksheetReaderOptions]
      }
      
      @scala.inline
      implicit class WorksheetReaderOptionsMutableBuilder[Self <: WorksheetReaderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEntry(value: Stream): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptions(value: WorkbookStreamReaderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkbook(value: Workbook): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ZlibOptions extends StObject {
      
      /**
      			 * @default 16*1024
      			 */
      var chunkSize: Double = js.native
      
      // compression only
      var dictionary: Buffer | TypedArray | DataView | ArrayBuffer = js.native
      
      /**
      			 * @default constants.Z_FINISH
      			 */
      var finishFlush: Double = js.native
      
      /**
      			 * @default constants.Z_NO_FLUSH
      			 */
      var flush: Double = js.native
      
      var level: Double = js.native
      
      // compression only
      var memLevel: Double = js.native
      
      // compression only
      var strategy: Double = js.native
      
      var windowBits: Double = js.native
    }
    object ZlibOptions {
      
      @scala.inline
      def apply(
        chunkSize: Double,
        dictionary: Buffer | TypedArray | DataView | ArrayBuffer,
        finishFlush: Double,
        flush: Double,
        level: Double,
        memLevel: Double,
        strategy: Double,
        windowBits: Double
      ): ZlibOptions = {
        val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], finishFlush = finishFlush.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], memLevel = memLevel.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], windowBits = windowBits.asInstanceOf[js.Any])
        __obj.asInstanceOf[ZlibOptions]
      }
      
      @scala.inline
      implicit class ZlibOptionsMutableBuilder[Self <: ZlibOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDictionary(value: Buffer | TypedArray | DataView | ArrayBuffer): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      }
    }
  }
}
