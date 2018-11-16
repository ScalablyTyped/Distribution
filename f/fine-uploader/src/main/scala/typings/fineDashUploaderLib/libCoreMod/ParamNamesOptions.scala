package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParamNamesOptions extends js.Object {
  /**
           * Name of the parameter passed with a chunked request that specifies the size in bytes of the associated chunk
           *
           * @default `'qqchunksize'`
           */
  var chunkSize: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of the parameter passed with a chunked request that specifies the starting byte of the associated chunk
           *
           * @default `'qqpartbyteoffset'`
           */
  var partByteOffset: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of the parameter passed with a chunked request that specifies the index of the associated partition
           *
           * @default `'qqpartindex'`
           */
  var partIndex: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sent with the first request of the resume with a value of `true`
           *
           * @default `'qqresume'`
           */
  var resuming: js.UndefOr[java.lang.String] = js.undefined
  /**
           * totalFileSize
           *
           * @default `'qqtotalfilesize'`
           */
  var totalFileSize: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of the parameter passed with a chunked request that specifies the total number of chunks associated with the `File` or `Blob`
           *
           * @default `'qqtotalparts'`
           */
  var totalParts: js.UndefOr[java.lang.String] = js.undefined
}

