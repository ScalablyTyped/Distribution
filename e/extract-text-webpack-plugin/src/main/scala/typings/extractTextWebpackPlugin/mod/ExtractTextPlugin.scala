package typings.extractTextWebpackPlugin.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
  * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
  */
@js.native
trait ExtractTextPlugin extends Plugin {
  /**
    * Creates an extracting loader from an existing loader (instance).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#multiple-instances}
    */
  def extract(
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
  ] = js.native
  def extract(
    loader: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
    ]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
  ] = js.native
  def extract(loader: LoaderOptions): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
  ] = js.native
}

