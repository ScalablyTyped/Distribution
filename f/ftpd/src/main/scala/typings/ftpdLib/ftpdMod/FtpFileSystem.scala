package typings
package ftpdLib.ftpdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FtpFileSystem extends js.Object {
  /**
    * if useReadFile option is not set or is false
    */
  var createReadStream: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* options */ js.UndefOr[ftpdLib.Anon_Flags], 
      nodeLib.fsMod.ReadStream
    ]
  ] = js.native
  /**
    * if useWriteFile option is not set or is false
    */
  var createWriteStream: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* options */ js.UndefOr[ftpdLib.Anon_EncodingString], 
      nodeLib.fsMod.WriteStream
    ]
  ] = js.native
  var mkdir: (js.Function2[
    /* path */ java.lang.String, 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]], 
    scala.Unit
  ]) | (js.Function3[
    /* path */ java.lang.String, 
    /* mode */ scala.Double, 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]], 
    scala.Unit
  ]) | (js.Function3[
    /* path */ java.lang.String, 
    /* mode */ java.lang.String, 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]], 
    scala.Unit
  ]) = js.native
  var open: (js.Function3[
    /* path */ java.lang.String, 
    /* flags */ java.lang.String, 
    /* callback */ js.UndefOr[
      js.Function2[
        /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
        /* fd */ js.UndefOr[scala.Double], 
        _
      ]
    ], 
    scala.Unit
  ]) | (js.Function4[
    /* path */ java.lang.String, 
    /* flags */ java.lang.String, 
    /* mode */ scala.Double, 
    /* callback */ js.UndefOr[
      js.Function2[
        /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
        /* fd */ js.UndefOr[scala.Double], 
        _
      ]
    ], 
    scala.Unit
  ]) | (js.Function4[
    /* path */ java.lang.String, 
    /* flags */ java.lang.String, 
    /* mode */ java.lang.String, 
    /* callback */ js.UndefOr[
      js.Function2[
        /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
        /* fd */ js.UndefOr[scala.Double], 
        _
      ]
    ], 
    scala.Unit
  ]) = js.native
  /**
    * if useReadFile option is set to 'true'
    */
  var readFile: js.UndefOr[
    (js.Function3[
      /* filename */ java.lang.String, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit], 
      scala.Unit
    ]) | (js.Function3[
      /* filename */ java.lang.String, 
      /* options */ ftpdLib.Anon_Encoding, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit], 
      scala.Unit
    ]) | (js.Function3[
      /* filename */ java.lang.String, 
      /* options */ ftpdLib.Anon_Flag, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]) | (js.Function2[
      /* filename */ java.lang.String, 
      /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ])
  ] = js.native
  /**
    * if useWriteFile option is set to 'true'
    */
  var writeFile: js.UndefOr[
    (js.Function3[
      /* filename */ java.lang.String, 
      /* data */ js.Any, 
      /* callback */ js.UndefOr[js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]], 
      scala.Unit
    ]) | (js.Function4[
      /* filename */ java.lang.String, 
      /* data */ js.Any, 
      /* options */ ftpdLib.Anon_EncodingMode, 
      /* callback */ js.UndefOr[js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]], 
      scala.Unit
    ]) | (js.Function4[
      /* filename */ java.lang.String, 
      /* data */ js.Any, 
      /* options */ ftpdLib.Anon_EncodingModeFlag, 
      /* callback */ js.UndefOr[js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]], 
      scala.Unit
    ])
  ] = js.native
  def close(fd: scala.Double): scala.Unit = js.native
  def close(
    fd: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def readdir(path: java.lang.String): scala.Unit = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
      /* files */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def rename(
    oldPath: java.lang.String,
    newPath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def rmdir(path: java.lang.String): scala.Unit = js.native
  def rmdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
    * specific object properties: { mode, isDirectory(), size, mtime }
    */
  def stat(path: java.lang.String): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
      /* stats */ js.UndefOr[nodeLib.fsMod.Stats], 
      _
    ]
  ): scala.Unit = js.native
  def unlink(path: java.lang.String): scala.Unit = js.native
  def unlink(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
}

