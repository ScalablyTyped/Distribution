package typings.download

import typings.decompress.mod.DecompressOptions
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Download and extract files.
    *
    * @param url URL to download.
    * @param destination Path to where your file will be written.
    * @param options Same options as [`got`](https://github.com/sindresorhus/got#options)
    * and [`decompress`](https://github.com/kevva/decompress#options) in addition to the
    * ones from this package.
    *
    * @example
    * import fs from 'fs';
    * import download = require('download');
    *
    * (async () => {
    *     await download('http://unicorn.com/foo.jpg', 'dist');
    *
    *     fs.writeFileSync('dist/foo.jpg', await download('http://unicorn.com/foo.jpg'));
    *
    *     download('unicorn.com/foo.jpg').pipe(fs.createWriteStream('dist/foo.jpg'));
    *
    *     await Promise.all([
    *         'unicorn.com/foo.jpg',
    *         'cats.com/dancing.gif'
    *     ].map(url => download(url, 'dist')));
    * })();
    */
  inline def apply(url: String): js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex]
  inline def apply(url: String, destination: String): js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex]
  inline def apply(url: String, destination: String, options: DownloadOptions): js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex]
  inline def apply(url: String, destination: Unit, options: DownloadOptions): js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex]
  inline def apply(url: String, options: DownloadOptions): js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotEmitter */ Any) & Duplex]
  
  @JSImport("download", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotOptions<string | null> * / any */ trait DownloadOptions
    extends StObject
       with DecompressOptions {
    
    /**
      * If set to `true`, try extracting the file using
      * [`decompress`](https://github.com/kevva/decompress).
      *
      * @default false
      */
    var extract: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the saved file.
      */
    var filename: js.UndefOr[String] = js.undefined
  }
  object DownloadOptions {
    
    inline def apply(): DownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
