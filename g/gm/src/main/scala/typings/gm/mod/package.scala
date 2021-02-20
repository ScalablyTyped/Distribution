package typings.gm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(stream: java.lang.String): typings.gm.mod.State = typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(stream: java.lang.String, image: java.lang.String): typings.gm.mod.State = (typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(stream: typings.node.Buffer): typings.gm.mod.State = typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(stream: typings.node.Buffer, image: java.lang.String): typings.gm.mod.State = (typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(stream: typings.node.NodeJS.ReadableStream): typings.gm.mod.State = typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(stream: typings.node.NodeJS.ReadableStream, image: java.lang.String): typings.gm.mod.State = (typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(width: scala.Double, height: scala.Double): typings.gm.mod.State = (typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.gm.mod.State]
  @scala.inline
  def apply(width: scala.Double, height: scala.Double, color: java.lang.String): typings.gm.mod.State = (typings.gm.mod.^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typings.gm.mod.State]
  
  type CompareCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  
  type GetterCallback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* value */ T, js.Any]
  
  type WriteCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* stdout */ typings.node.streamMod.Readable, 
    /* stderr */ typings.node.streamMod.Readable, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
  
  @scala.inline
  def compare(filename1: java.lang.String, filename2: java.lang.String, callback: typings.gm.mod.CompareCallback): scala.Unit = (typings.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: scala.Double,
    callback: typings.gm.mod.CompareCallback
  ): scala.Unit = (typings.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: typings.gm.mod.CompareOptions,
    callback: typings.gm.mod.CompareCallback
  ): scala.Unit = (typings.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def subClass(options: typings.gm.mod.ClassOptions): typings.gm.mod.SubClass_ = typings.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("subClass")(options.asInstanceOf[js.Any]).asInstanceOf[typings.gm.mod.SubClass_]
}
