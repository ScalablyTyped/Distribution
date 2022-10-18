package typings.gm.mod

import typings.gm.mod.^
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(stream: String): State = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[State]
inline def apply(stream: String, image: String): State = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[State]
inline def apply(stream: ReadableStream): State = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[State]
inline def apply(stream: ReadableStream, image: String): State = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[State]
inline def apply(stream: Buffer): State = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[State]
inline def apply(stream: Buffer, image: String): State = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[State]
inline def apply(width: Double, height: Double): State = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[State]
inline def apply(width: Double, height: Double, color: String): State = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[State]

inline def compare(filename1: String, filename2: String, callback: CompareCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def compare(filename1: String, filename2: String, options: Double, callback: CompareCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def compare(filename1: String, filename2: String, options: CompareOptions, callback: CompareCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def subClass(options: ClassOptions): SubClass_ = ^.asInstanceOf[js.Dynamic].applyDynamic("subClass")(options.asInstanceOf[js.Any]).asInstanceOf[SubClass_]

type CompareCallback = js.Function4[
/* err */ js.Error | Null, 
/* isEqual */ Boolean, 
/* equality */ Double, 
/* raw */ Double, 
Any]

type GetterCallback[T] = js.Function2[/* err */ js.Error | Null, /* value */ T, Any]

type WriteCallback = js.Function4[
/* err */ js.Error | Null, 
/* stdout */ Readable, 
/* stderr */ Readable, 
/* cmd */ String, 
Any]
