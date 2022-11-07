package typings.draco3d.mod

import typings.draco3d.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createDecoderModule(): js.Promise[DecoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoderModule")().asInstanceOf[js.Promise[DecoderModule]]
inline def createDecoderModule(`object`: Record[String, Any]): js.Promise[DecoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoderModule")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecoderModule]]

inline def createEncoderModule(): js.Promise[EncoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoderModule")().asInstanceOf[js.Promise[EncoderModule]]
inline def createEncoderModule(`object`: Record[String, Any]): js.Promise[EncoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoderModule")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncoderModule]]

type DracoDecoderModule = js.Function1[/* props */ DracoDecoderModuleProps, js.Promise[DecoderModule]]

type DracoFloat32Array = DracoArray

type DracoInt16Array = DracoArray

type DracoInt32Array = DracoArray

type DracoInt8Array = DracoArray

type DracoUInt16Array = DracoArray

type DracoUInt32Array = DracoArray

type DracoUInt8Array = DracoArray

type TypedArray = js.typedarray.Float32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Int8Array
