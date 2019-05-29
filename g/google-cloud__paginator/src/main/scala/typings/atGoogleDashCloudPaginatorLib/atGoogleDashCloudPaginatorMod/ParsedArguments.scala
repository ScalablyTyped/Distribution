package typings
package atGoogleDashCloudPaginatorLib.atGoogleDashCloudPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedArguments
  extends nodeLib.streamMod.TransformOptions {
  /**
    * Auto-pagination enabled.
    */
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback function.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
    * Maximum API calls to make.
    */
  var maxApiCalls: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum results to return.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query object. This is most commonly an object, but to make the API more
    * simple, it can also be a string in some places.
    */
  var query: js.UndefOr[ParsedArguments] = js.undefined
  var streamOptions: js.UndefOr[ParsedArguments] = js.undefined
}

object ParsedArguments {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    callback: js.Function = null,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEncoding: java.lang.String = null,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_DuplexOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Duplex, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_TransformOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Transform, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    emitClose: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    `final`: js.ThisFunction1[
      (/* this */ nodeLib.streamMod.Duplex) | (/* this */ nodeLib.streamMod.Writable), 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    final_TransformOptions: js.ThisFunction1[
      /* this */ nodeLib.streamMod.Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    flush: js.ThisFunction1[
      /* this */ nodeLib.streamMod.Transform, 
      /* callback */ nodeLib.streamMod.TransformCallback, 
      scala.Unit
    ] = null,
    highWaterMark: scala.Int | scala.Double = null,
    maxApiCalls: scala.Int | scala.Double = null,
    maxResults: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    pageSize: scala.Int | scala.Double = null,
    query: ParsedArguments = null,
    read: js.ThisFunction1[/* this */ nodeLib.streamMod.Readable, /* size */ scala.Double, scala.Unit] = null,
    read_DuplexOptions: js.ThisFunction1[/* this */ nodeLib.streamMod.Duplex, /* size */ scala.Double, scala.Unit] = null,
    read_TransformOptions: js.ThisFunction1[/* this */ nodeLib.streamMod.Transform, /* size */ scala.Double, scala.Unit] = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    streamOptions: ParsedArguments = null,
    transform: js.ThisFunction3[
      /* this */ nodeLib.streamMod.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ nodeLib.streamMod.TransformCallback, 
      scala.Unit
    ] = null,
    writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.ThisFunction3[
      (/* this */ nodeLib.streamMod.Duplex) | (/* this */ nodeLib.streamMod.Writable), 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    write_TransformOptions: js.ThisFunction3[
      /* this */ nodeLib.streamMod.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      (/* this */ nodeLib.streamMod.Duplex) | (/* this */ nodeLib.streamMod.Writable), 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev_TransformOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Transform, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): ParsedArguments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (destroy_DuplexOptions != null) __obj.updateDynamic("destroy")(destroy_DuplexOptions)
    if (destroy_TransformOptions != null) __obj.updateDynamic("destroy")(destroy_TransformOptions)
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (final_TransformOptions != null) __obj.updateDynamic("final")(final_TransformOptions)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (read != null) __obj.updateDynamic("read")(read)
    if (read_DuplexOptions != null) __obj.updateDynamic("read")(read_DuplexOptions)
    if (read_TransformOptions != null) __obj.updateDynamic("read")(read_TransformOptions)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (streamOptions != null) __obj.updateDynamic("streamOptions")(streamOptions)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (write_TransformOptions != null) __obj.updateDynamic("write")(write_TransformOptions)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    if (writev_TransformOptions != null) __obj.updateDynamic("writev")(writev_TransformOptions)
    __obj.asInstanceOf[ParsedArguments]
  }
}

