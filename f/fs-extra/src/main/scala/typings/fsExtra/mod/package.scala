package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def access(path: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def access(
  path: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def access(path: typings.node.fsMod.PathLike, mode: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def access(
  path: typings.node.fsMod.PathLike,
  mode: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def accessSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def accessSync(path: typings.node.fsMod.PathLike, mode: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def appendFile(file: scala.Double, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def appendFile(
  file: scala.Double,
  data: js.Any,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFile(file: scala.Double, data: js.Any, options: typings.fsExtra.anon.Encoding): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def appendFile(
  file: scala.Double,
  data: js.Any,
  options: typings.fsExtra.anon.Encoding,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFile(file: typings.node.fsMod.PathLike, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def appendFile(
  file: typings.node.fsMod.PathLike,
  data: js.Any,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFile(file: typings.node.fsMod.PathLike, data: js.Any, options: typings.fsExtra.anon.Encoding): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def appendFile(
  file: typings.node.fsMod.PathLike,
  data: js.Any,
  options: typings.fsExtra.anon.Encoding,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def appendFileSync(file: scala.Double, data: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(file: scala.Double, data: java.lang.String, options: typings.node.fsMod.WriteFileOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(file: scala.Double, data: typings.std.Uint8Array): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(file: scala.Double, data: typings.std.Uint8Array, options: typings.node.fsMod.WriteFileOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(file: typings.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(
  file: typings.node.fsMod.PathLike,
  data: java.lang.String,
  options: typings.node.fsMod.WriteFileOptions
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(file: typings.node.fsMod.PathLike, data: typings.std.Uint8Array): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def appendFileSync(
  file: typings.node.fsMod.PathLike,
  data: typings.std.Uint8Array,
  options: typings.node.fsMod.WriteFileOptions
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def chmod(path: typings.node.fsMod.PathLike, mode: typings.fsExtra.mod.Mode): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def chmod(
  path: typings.node.fsMod.PathLike,
  mode: typings.fsExtra.mod.Mode,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def chmodSync(path: typings.node.fsMod.PathLike, mode: typings.node.fsMod.Mode): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def chown(path: typings.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def chown(
  path: typings.node.fsMod.PathLike,
  uid: scala.Double,
  gid: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def chownSync(path: typings.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def close(fd: scala.Double): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def close(fd: scala.Double, callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def closeSync(fd: scala.Double): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def copy(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def copy(
  src: java.lang.String,
  dest: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def copy(src: java.lang.String, dest: java.lang.String, options: typings.fsExtra.mod.CopyOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def copy(
  src: java.lang.String,
  dest: java.lang.String,
  options: typings.fsExtra.mod.CopyOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def copyFile(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def copyFile(
  src: java.lang.String,
  dest: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def copyFile(src: java.lang.String, dest: java.lang.String, flags: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def copyFile(
  src: java.lang.String,
  dest: java.lang.String,
  flags: scala.Double,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def copyFileSync(src: typings.node.fsMod.PathLike, dest: typings.node.fsMod.PathLike): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def copyFileSync(src: typings.node.fsMod.PathLike, dest: typings.node.fsMod.PathLike, flags: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def copySync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def copySync(src: java.lang.String, dest: java.lang.String, options: typings.fsExtra.mod.CopyOptionsSync): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def createFile(file: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def createFile(file: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def createFileSync(file: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def createLink(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def createLink(
  src: java.lang.String,
  dest: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def createLinkSync: js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].selectDynamic("createLinkSync").asInstanceOf[js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Unit]]

@scala.inline
def createReadStream(path: typings.node.fsMod.PathLike): typings.node.fsMod.ReadStream = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.ReadStream]
@scala.inline
def createReadStream(path: typings.node.fsMod.PathLike, options: java.lang.String): typings.node.fsMod.ReadStream = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
@scala.inline
def createReadStream(path: typings.node.fsMod.PathLike, options: typings.node.anon.AutoClose): typings.node.fsMod.ReadStream = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]

@scala.inline
def createSymlink(src: java.lang.String, dest: java.lang.String, `type`: typings.fsExtra.mod.SymlinkType): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def createSymlink(
  src: java.lang.String,
  dest: java.lang.String,
  `type`: typings.fsExtra.mod.SymlinkType,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def createSymlinkSync(src: java.lang.String, dest: java.lang.String, `type`: typings.fsExtra.mod.SymlinkType): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def createSymlink_Promise(src: java.lang.String, dest: java.lang.String, `type`: typings.fsExtra.mod.SymlinkType): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]

@scala.inline
def createWriteStream(path: typings.node.fsMod.PathLike): typings.node.fsMod.WriteStream = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.WriteStream]
@scala.inline
def createWriteStream(path: typings.node.fsMod.PathLike, options: java.lang.String): typings.node.fsMod.WriteStream = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
@scala.inline
def createWriteStream(path: typings.node.fsMod.PathLike, options: typings.node.anon.EmitClose): typings.node.fsMod.WriteStream = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]

@scala.inline
def emptyDirSync_(path: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def emptyDir_(path: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def emptyDir_(path: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def emptydir(path: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def emptydir(path: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def emptydirSync: js.Function1[/* path */ java.lang.String, scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].selectDynamic("emptydirSync").asInstanceOf[js.Function1[/* path */ java.lang.String, scala.Unit]]

@scala.inline
def ensureDir(path: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def ensureDir(path: java.lang.String, options: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureDir(
  path: java.lang.String,
  options: scala.Double,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureDir(
  path: java.lang.String,
  options: scala.Unit,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureDir(path: java.lang.String, options: typings.fsExtra.mod.EnsureOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureDir(
  path: java.lang.String,
  options: typings.fsExtra.mod.EnsureOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensureDirSync(path: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def ensureDirSync(path: java.lang.String, options: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureDirSync(path: java.lang.String, options: typings.fsExtra.mod.EnsureOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensureDir_Promise(path: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ensureDir_Promise(path: java.lang.String, options: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ensureDir_Promise(path: java.lang.String, options: typings.fsExtra.mod.EnsureOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]

@scala.inline
def ensureFile(path: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ensureFile(path: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensureFileSync(path: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def ensureLink(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ensureLink(
  src: java.lang.String,
  dest: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensureLinkSync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureLinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensureSymlink(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ensureSymlink(
  src: java.lang.String,
  dest: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureSymlink(src: java.lang.String, dest: java.lang.String, `type`: typings.fsExtra.mod.SymlinkType): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ensureSymlink(
  src: java.lang.String,
  dest: java.lang.String,
  `type`: typings.fsExtra.mod.SymlinkType,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ensureSymlinkSync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ensureSymlinkSync(src: java.lang.String, dest: java.lang.String, `type`: typings.fsExtra.mod.SymlinkType): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def exists(path: typings.node.fsMod.PathLike, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def existsSync(path: typings.node.fsMod.PathLike): scala.Boolean = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def fchmod(fd: scala.Double, mode: typings.fsExtra.mod.Mode): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def fchmod(
  fd: scala.Double,
  mode: typings.fsExtra.mod.Mode,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fchmodSync(fd: scala.Double, mode: typings.node.fsMod.Mode): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def fchown(
  fd: scala.Double,
  uid: scala.Double,
  gid: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fdatasync(fd: scala.Double): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def fdatasync(fd: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fdatasyncSync(fd: scala.Double): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def fstat(fd: scala.Double): js.Promise[typings.node.fsMod.Stats] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
@scala.inline
def fstat(
  fd: scala.Double,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* stats */ typings.node.fsMod.Stats, 
  js.Any
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fstatSync(fd: scala.Double): typings.node.fsMod.Stats = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]

@scala.inline
def fsync(fd: scala.Double): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def fsync(fd: scala.Double, callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def fsyncSync(fd: scala.Double): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def ftruncate(fd: scala.Double): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ftruncate(fd: scala.Double, callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def ftruncate(fd: scala.Double, len: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def ftruncate(
  fd: scala.Double,
  len: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def ftruncateSync(fd: scala.Double): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def futimes(
  fd: scala.Double,
  atime: scala.Double,
  mtime: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimes(fd: scala.Double, atime: typings.std.Date, mtime: typings.std.Date): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def futimes(
  fd: scala.Double,
  atime: typings.std.Date,
  mtime: typings.std.Date,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: scala.Double, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: typings.std.Date, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: typings.std.Date, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def futimesSync(fd: scala.Double, atime: typings.std.Date, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lchmod(
  path: typings.node.fsMod.PathLike,
  mode: typings.node.fsMod.Mode,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lchmodSync(path: typings.node.fsMod.PathLike, mode: typings.node.fsMod.Mode): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lchown(path: typings.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def lchown(
  path: typings.node.fsMod.PathLike,
  uid: scala.Double,
  gid: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lchownSync(path: typings.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def link(existingPath: typings.node.fsMod.PathLike, newPath: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def link(
  existingPath: typings.node.fsMod.PathLike,
  newPath: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def linkSync(existingPath: typings.node.fsMod.PathLike, newPath: typings.node.fsMod.PathLike): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lstat(path: typings.node.fsMod.PathLike): js.Promise[typings.node.fsMod.Stats] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
@scala.inline
def lstat(
  path: typings.node.fsMod.PathLike,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* stats */ typings.node.fsMod.Stats, 
  js.Any
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lstatSync(path: typings.node.fsMod.PathLike): typings.node.fsMod.Stats = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]

@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: java.lang.String,
  mtime: java.lang.String,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: java.lang.String,
  mtime: scala.Double,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: java.lang.String,
  mtime: typings.std.Date,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: scala.Double,
  mtime: java.lang.String,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: scala.Double,
  mtime: scala.Double,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: scala.Double,
  mtime: typings.std.Date,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: typings.std.Date,
  mtime: java.lang.String,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: typings.std.Date,
  mtime: scala.Double,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimes(
  path: typings.node.fsMod.PathLike,
  atime: typings.std.Date,
  mtime: typings.std.Date,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lutimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mkdir(path: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def mkdir(
  path: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def mkdir(
  path: typings.node.fsMod.PathLike,
  options: scala.Null,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def mkdir(
  path: typings.node.fsMod.PathLike,
  options: typings.fsExtra.mod.Mode,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def mkdir(
  path: typings.node.fsMod.PathLike,
  options: typings.node.fsMod.MakeDirectoryOptions,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mkdirSync(path: typings.node.fsMod.PathLike): js.UndefOr[java.lang.String] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
@scala.inline
def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.MakeDirectoryOptionsrecur): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.MakeDirectoryOptionsrecurMode): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.MakeDirectoryOptions): js.UndefOr[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
@scala.inline
def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.Mode): js.UndefOr[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]

@scala.inline
def mkdirSync_Unit(path: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def mkdirSync_Unit(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.Mode): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mkdirp(dir: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def mkdirp(dir: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mkdirpSync(dir: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(dir.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def mkdirs(dir: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def mkdirs(dir: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mkdirsSync(dir: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsSync")(dir.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def mkdtemp(prefix: java.lang.String): js.Promise[java.lang.String] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def mkdtemp(
  prefix: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* folder */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mkdtempSync(prefix: java.lang.String): java.lang.String = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
@scala.inline
def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def mkdtempSync(prefix: java.lang.String, options: typings.node.BufferEncoding): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def mkdtempSync(prefix: java.lang.String, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def mkdtempSync(prefix: java.lang.String, options: typings.node.fsMod.BufferEncodingOption): typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]

@scala.inline
def mkdtempSync_Union(prefix: java.lang.String): java.lang.String | typings.node.Buffer = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def mkdtempSync_Union(prefix: java.lang.String, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]

@scala.inline
def move(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def move(
  src: java.lang.String,
  dest: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def move(src: java.lang.String, dest: java.lang.String, options: typings.fsExtra.mod.MoveOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def move(
  src: java.lang.String,
  dest: java.lang.String,
  options: typings.fsExtra.mod.MoveOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def moveSync(src: java.lang.String, dest: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def moveSync(src: java.lang.String, dest: java.lang.String, options: typings.fsExtra.mod.MoveOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def open(path: typings.node.fsMod.PathLike, flags: java.lang.String): js.Promise[scala.Double] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
@scala.inline
def open(
  path: typings.node.fsMod.PathLike,
  flags: java.lang.String,
  callback: js.Function2[/* err */ typings.node.NodeJS.ErrnoException, /* fd */ scala.Double, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def open(path: typings.node.fsMod.PathLike, flags: java.lang.String, mode: typings.fsExtra.mod.Mode): js.Promise[scala.Double] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
@scala.inline
def open(
  path: typings.node.fsMod.PathLike,
  flags: java.lang.String,
  mode: typings.fsExtra.mod.Mode,
  callback: js.Function2[/* err */ typings.node.NodeJS.ErrnoException, /* fd */ scala.Double, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def open(path: typings.node.fsMod.PathLike, flags: scala.Double): js.Promise[scala.Double] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
@scala.inline
def open(
  path: typings.node.fsMod.PathLike,
  flags: scala.Double,
  callback: js.Function2[/* err */ typings.node.NodeJS.ErrnoException, /* fd */ scala.Double, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def open(path: typings.node.fsMod.PathLike, flags: scala.Double, mode: typings.fsExtra.mod.Mode): js.Promise[scala.Double] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Double]]
@scala.inline
def open(
  path: typings.node.fsMod.PathLike,
  flags: scala.Double,
  mode: typings.fsExtra.mod.Mode,
  callback: js.Function2[/* err */ typings.node.NodeJS.ErrnoException, /* fd */ scala.Double, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def openSync(path: typings.node.fsMod.PathLike, flags: typings.node.fsMod.OpenMode): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def openSync(
  path: typings.node.fsMod.PathLike,
  flags: typings.node.fsMod.OpenMode,
  mode: typings.node.fsMod.Mode
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def opendir(path: java.lang.String): js.Promise[typings.node.fsMod.Dir] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Dir]]
@scala.inline
def opendir(
  path: java.lang.String,
  cb: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* dir */ typings.node.fsMod.Dir, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def opendir(path: java.lang.String, options: typings.node.fsMod.OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.fsMod.Dir]]
@scala.inline
def opendir(
  path: java.lang.String,
  options: typings.node.fsMod.OpenDirOptions,
  cb: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* dir */ typings.node.fsMod.Dir, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def opendirSync(path: java.lang.String): typings.node.fsMod.Dir = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Dir]
@scala.inline
def opendirSync(path: java.lang.String, options: typings.node.fsMod.OpenDirOptions): typings.node.fsMod.Dir = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Dir]

@scala.inline
def outputFile(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputFile(
  file: java.lang.String,
  data: js.Any,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputFile(file: java.lang.String, data: js.Any, options: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputFile(
  file: java.lang.String,
  data: js.Any,
  options: java.lang.String,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputFile(file: java.lang.String, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputFile(
  file: java.lang.String,
  data: js.Any,
  options: typings.fsExtra.mod.WriteFileOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def outputFileSync(file: java.lang.String, data: js.Any): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputFileSync(file: java.lang.String, data: js.Any, options: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputFileSync(file: java.lang.String, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def outputJSONSync_(file: java.lang.String, data: js.Any): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputJSONSync_(file: java.lang.String, data: js.Any, options: typings.fsExtra.mod.WriteOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def outputJSON_(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputJSON_(
  file: java.lang.String,
  data: js.Any,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputJSON_(file: java.lang.String, data: js.Any, options: typings.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputJSON_(
  file: java.lang.String,
  data: js.Any,
  options: typings.fsExtra.mod.WriteOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def outputJson(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputJson(
  file: java.lang.String,
  data: js.Any,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputJson(file: java.lang.String, data: js.Any, options: typings.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def outputJson(
  file: java.lang.String,
  data: js.Any,
  options: typings.fsExtra.mod.WriteOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def outputJsonSync(file: java.lang.String, data: js.Any): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def outputJsonSync(file: java.lang.String, data: js.Any, options: typings.fsExtra.mod.WriteOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def pathExists(path: java.lang.String): js.Promise[scala.Boolean] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
@scala.inline
def pathExists(
  path: java.lang.String,
  callback: js.Function2[/* err */ typings.std.Error, /* exists */ scala.Boolean, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def pathExistsSync(path: java.lang.String): scala.Boolean = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def read(fd: scala.Double, buffer: typings.std.DataView, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferDataView] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataView]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferDataView] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataView]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.DataView, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.DataView, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Float32Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat32Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat32Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Float32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Float32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Float64Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat64Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat64Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Float64Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Float64Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Int16Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Int16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Int16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Int32Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt32Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt32Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Int32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Int32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Int8Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt8Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt8Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Int8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Int8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Uint16Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferBytesRead] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesRead]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferBytesRead] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesRead]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Uint32Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferUint32Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint32Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferUint32Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint32Array]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(fd: scala.Double, buffer: typings.std.Uint8Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.Buffer] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.Buffer]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.Buffer] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.Buffer]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double
): js.Promise[typings.fsExtra.anon.BytesRead] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesRead]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesRead] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesRead]]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint8ClampedArray, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def read(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* bytesRead */ scala.Double, 
  /* buffer */ typings.std.Uint8ClampedArray, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def readFile(file: scala.Double): js.Promise[typings.node.Buffer] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.Buffer]]
@scala.inline
def readFile(
  file: scala.Double,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ typings.node.Buffer, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: scala.Double, encoding: java.lang.String): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readFile(
  file: scala.Double,
  encoding: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: scala.Double, options: typings.fsExtra.anon.EncodingFlag): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readFile(
  file: scala.Double,
  options: typings.fsExtra.anon.EncodingFlag,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ typings.node.Buffer, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: scala.Double, options: typings.fsExtra.anon.Flag): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readFile(
  file: scala.Double,
  options: typings.fsExtra.anon.Flag,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ typings.node.Buffer, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: typings.node.fsMod.PathLike): js.Promise[typings.node.Buffer] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.Buffer]]
@scala.inline
def readFile(
  file: typings.node.fsMod.PathLike,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ typings.node.Buffer, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: typings.node.fsMod.PathLike, encoding: java.lang.String): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readFile(
  file: typings.node.fsMod.PathLike,
  encoding: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: typings.node.fsMod.PathLike, options: typings.fsExtra.anon.EncodingFlag): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readFile(
  file: typings.node.fsMod.PathLike,
  options: typings.fsExtra.anon.EncodingFlag,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ typings.node.Buffer, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readFile(file: typings.node.fsMod.PathLike, options: typings.fsExtra.anon.Flag): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readFile(
  file: typings.node.fsMod.PathLike,
  options: typings.fsExtra.anon.Flag,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* data */ typings.node.Buffer, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def readFileSync(path: scala.Double): java.lang.String | typings.node.Buffer = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readFileSync(path: scala.Double, options: typings.node.BufferEncoding): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def readFileSync(path: scala.Double, options: typings.node.anon.BaseEncodingOptionsflagst): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readFileSync(path: scala.Double, options: typings.node.anon.EncodingBufferEncoding): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def readFileSync(path: scala.Double, options: typings.node.anon.`3`): typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
@scala.inline
def readFileSync(path: typings.node.fsMod.PathLike): java.lang.String | typings.node.Buffer = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.BaseEncodingOptionsflagst): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.EncodingBufferEncoding): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.`3`): typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]

@scala.inline
def readFileSync_Buffer(path: scala.Double): typings.node.Buffer = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
@scala.inline
def readFileSync_Buffer(path: typings.node.fsMod.PathLike): typings.node.Buffer = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]

@scala.inline
def readFileSync_Union(path: scala.Double, options: typings.node.BufferEncoding): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readFileSync_Union(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]

@scala.inline
def readJSONSync_(file: java.lang.String): js.Any = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def readJSONSync_(file: java.lang.String, options: typings.fsExtra.mod.ReadOptions): js.Any = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def readJSON_(file: java.lang.String): js.Promise[js.Any] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
@scala.inline
def readJSON_(
  file: java.lang.String,
  callback: js.Function2[/* err */ typings.std.Error, /* jsonObject */ js.Any, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readJSON_(file: java.lang.String, options: typings.fsExtra.mod.ReadOptions): js.Promise[js.Any] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
@scala.inline
def readJSON_(
  file: java.lang.String,
  options: typings.fsExtra.mod.ReadOptions,
  callback: js.Function2[/* err */ typings.std.Error, /* jsonObject */ js.Any, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def readJson(file: java.lang.String): js.Promise[js.Any] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
@scala.inline
def readJson(
  file: java.lang.String,
  callback: js.Function2[/* err */ typings.std.Error, /* jsonObject */ js.Any, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readJson(file: java.lang.String, options: typings.fsExtra.mod.ReadOptions): js.Promise[js.Any] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
@scala.inline
def readJson(
  file: java.lang.String,
  options: typings.fsExtra.mod.ReadOptions,
  callback: js.Function2[/* err */ typings.std.Error, /* jsonObject */ js.Any, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def readJsonSync(file: java.lang.String): js.Any = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def readJsonSync(file: java.lang.String, options: typings.fsExtra.mod.ReadOptions): js.Any = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def readSync(fd: scala.Double, buffer: typings.node.NodeJS.ArrayBufferView): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def readSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Double,
  length: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def readSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def readSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  opts: typings.node.fsMod.ReadSyncOptions
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def readdir(path: typings.node.fsMod.PathLike): js.Promise[js.Array[java.lang.String]] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
@scala.inline
def readdir(
  path: typings.node.fsMod.PathLike,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* files */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readdir(path: typings.node.fsMod.PathLike, options: typings.fsExtra.anon.EncodingWithFileTypes): js.Promise[js.Array[typings.node.Buffer]] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.Buffer]]]
@scala.inline
def readdir(path: typings.node.fsMod.PathLike, options: typings.fsExtra.anon.WithFileTypes): js.Promise[js.Array[java.lang.String]] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
@scala.inline
def readdir(path: typings.node.fsMod.PathLike, options: typings.fsExtra.anon.`0`): js.Promise[js.Array[typings.node.Buffer | java.lang.String]] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.Buffer | java.lang.String]]]
@scala.inline
def readdir(path: typings.node.fsMod.PathLike, options: typings.fsExtra.anon.`1`): js.Promise[js.Array[typings.node.fsMod.Dirent]] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.fsMod.Dirent]]]
@scala.inline
def readdir(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): js.Promise[js.Array[java.lang.String]] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]

@scala.inline
def readdirSync(path: typings.node.fsMod.PathLike): js.Array[java.lang.String] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
@scala.inline
def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): js.Array[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
@scala.inline
def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.BaseEncodingOptionswithFi): js.Array[typings.node.Buffer | java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.Buffer | java.lang.String]]
@scala.inline
def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.BaseEncodingOptionswithFiEncoding): js.Array[typings.node.fsMod.Dirent] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.fsMod.Dirent]]
@scala.inline
def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.Encoding): js.Array[typings.node.Buffer] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.Buffer]]
@scala.inline
def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.WithFileTypes): js.Array[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def readdirSync_buffer(path: typings.node.fsMod.PathLike, options: typings.fsExtra.fsExtraStrings.buffer): js.Array[typings.node.Buffer] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.Buffer]]

@scala.inline
def readdir_buffer(path: typings.node.fsMod.PathLike, options: typings.fsExtra.fsExtraStrings.buffer): js.Promise[js.Array[typings.node.Buffer]] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.Buffer]]]

@scala.inline
def readlink(path: typings.node.fsMod.PathLike): js.Promise[java.lang.String] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def readlink(
  path: typings.node.fsMod.PathLike,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* linkString */ java.lang.String, 
  js.Any
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def readlinkSync(path: typings.node.fsMod.PathLike): java.lang.String = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
@scala.inline
def readlinkSync(path: typings.node.fsMod.PathLike, options: java.lang.String): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readlinkSync(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def readlinkSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def readlinkSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BufferEncodingOption): typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]

@scala.inline
def readlinkSync_Union(path: typings.node.fsMod.PathLike): java.lang.String | typings.node.Buffer = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
@scala.inline
def readlinkSync_Union(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String | typings.node.Buffer = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]

@scala.inline
def readv(
  fd: scala.Double,
  buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
  cb: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* bytesRead */ scala.Double, 
  /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def readv(
  fd: scala.Double,
  buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
  position: scala.Double,
  cb: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* bytesRead */ scala.Double, 
  /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def readvSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView]): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def readvSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView], position: scala.Double): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def realpath(path: typings.node.fsMod.PathLike): js.Promise[java.lang.String] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def realpath(
  path: typings.node.fsMod.PathLike,
  cache: org.scalablytyped.runtime.StringDictionary[java.lang.String]
): js.Promise[java.lang.String] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def realpath(
  path: typings.node.fsMod.PathLike,
  cache: org.scalablytyped.runtime.StringDictionary[java.lang.String],
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* resolvedPath */ java.lang.String, 
  js.Any
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def realpath(
  path: typings.node.fsMod.PathLike,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* resolvedPath */ java.lang.String, 
  js.Any
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def remove(dir: java.lang.String): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def remove(dir: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def removeSync(dir: java.lang.String): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def rename(oldPath: typings.node.fsMod.PathLike, newPath: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def rename(
  oldPath: typings.node.fsMod.PathLike,
  newPath: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def renameSync(oldPath: typings.node.fsMod.PathLike, newPath: typings.node.fsMod.PathLike): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def rm(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def rm(
  path: typings.node.fsMod.PathLike,
  options: typings.node.fsMod.RmOptions,
  callback: typings.node.fsMod.NoParamCallback
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def rmSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def rmSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.RmOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def rmdir(path: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def rmdir(
  path: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def rmdirSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def rmdirSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.RmDirOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def stat(path: typings.node.fsMod.PathLike): js.Promise[typings.node.fsMod.Stats] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
@scala.inline
def stat(
  path: typings.node.fsMod.PathLike,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* stats */ typings.node.fsMod.Stats, 
  js.Any
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def statSync(path: typings.node.fsMod.PathLike): typings.node.fsMod.Stats = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
@scala.inline
def statSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BigIntOptions): typings.node.fsMod.BigIntStats = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.BigIntStats]
@scala.inline
def statSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.StatOptions): typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats]

@scala.inline
def symlink(target: typings.node.fsMod.PathLike, path: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def symlink(
  target: typings.node.fsMod.PathLike,
  path: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def symlink(
  target: typings.node.fsMod.PathLike,
  path: typings.node.fsMod.PathLike,
  `type`: scala.Unit,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def symlink(
  target: typings.node.fsMod.PathLike,
  path: typings.node.fsMod.PathLike,
  `type`: typings.fsExtra.mod.SymlinkType
): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def symlink(
  target: typings.node.fsMod.PathLike,
  path: typings.node.fsMod.PathLike,
  `type`: typings.fsExtra.mod.SymlinkType,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def symlinkSync(target: typings.node.fsMod.PathLike, path: typings.node.fsMod.PathLike): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def symlinkSync(
  target: typings.node.fsMod.PathLike,
  path: typings.node.fsMod.PathLike,
  `type`: typings.node.fsMod.symlink.Type
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def truncate(path: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def truncate(
  path: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def truncate(path: typings.node.fsMod.PathLike, len: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def truncate(
  path: typings.node.fsMod.PathLike,
  len: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def truncateSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def truncateSync(path: typings.node.fsMod.PathLike, len: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def unlink(path: typings.node.fsMod.PathLike): js.Promise[scala.Unit] = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def unlink(
  path: typings.node.fsMod.PathLike,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def unlinkSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def unwatchFile(filename: typings.node.fsMod.PathLike): scala.Unit = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def unwatchFile(
  filename: typings.node.fsMod.PathLike,
  listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def utimes(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def utimes(
  path: typings.node.fsMod.PathLike,
  atime: scala.Double,
  mtime: scala.Double,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimes(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: typings.std.Date): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def utimes(
  path: typings.node.fsMod.PathLike,
  atime: typings.std.Date,
  mtime: typings.std.Date,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: scala.Double): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def utimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: typings.std.Date): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def watch(filename: typings.node.fsMod.PathLike): typings.node.fsMod.FSWatcher = typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, js.Any]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(filename: typings.node.fsMod.PathLike, options: java.lang.String): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  options: java.lang.String,
  listener: js.Function2[
  /* event */ java.lang.String, 
  /* filename */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  options: scala.Null,
  listener: js.Function2[
  /* event */ java.lang.String, 
  typings.node.Buffer | (/* filename */ java.lang.String), 
  scala.Unit
]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  options: scala.Unit,
  listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(filename: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  options: typings.node.BufferEncoding,
  listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(filename: typings.node.fsMod.PathLike, options: typings.node.anon.Persistent): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  options: typings.node.anon.Persistent,
  listener: js.Function2[
  /* event */ java.lang.String, 
  typings.node.Buffer | (/* filename */ java.lang.String), 
  scala.Unit
]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(filename: typings.node.fsMod.PathLike, options: typings.node.anon.Recursive): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch(
  filename: typings.node.fsMod.PathLike,
  options: typings.node.anon.Recursive,
  listener: js.Function2[/* event */ java.lang.String, /* filename */ typings.node.Buffer, scala.Unit]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]

@scala.inline
def watchFile(
  filename: typings.node.fsMod.PathLike,
  listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def watchFile(
  filename: typings.node.fsMod.PathLike,
  options: scala.Unit,
  listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def watchFile(
  filename: typings.node.fsMod.PathLike,
  options: typings.node.anon.Interval,
  listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def watch_buffer(filename: typings.node.fsMod.PathLike, options: typings.fsExtra.fsExtraStrings.buffer): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
@scala.inline
def watch_buffer(
  filename: typings.node.fsMod.PathLike,
  options: typings.fsExtra.fsExtraStrings.buffer,
  listener: js.Function2[/* event */ java.lang.String, /* filename */ typings.node.Buffer, scala.Unit]
): typings.node.fsMod.FSWatcher = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]

@scala.inline
def write(fd: scala.Double, buffer: typings.std.DataView): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.DataView, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.DataView, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.DataView, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.DataView, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.DataView, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.DataView, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.DataView,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferDataViewBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float32Array): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float32Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float32Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Float32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Float32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Float32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float32Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float32Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float64Array): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float64Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float64Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Float64Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Float64Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Float64Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Float64Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Float64Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int16Array): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int16Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int16Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int16Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int16Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int32Array): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int32Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int32Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int32Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int32Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int8Array): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int8Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int8Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Int8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Int8Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Int8Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint16Array): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint16Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint16Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint16Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint16Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint16Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferUint16Array] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferUint16Array]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint32Array): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint32Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint32Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint32Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint32Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint32Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWrittenNumber] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWrittenNumber]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8Array): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8Array, offset: scala.Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8Array, offset: scala.Double, length: scala.Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint8Array, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8Array, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8Array,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8ClampedArray): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8ClampedArray, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double
): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint8ClampedArray, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint8ClampedArray, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Null,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* buffer */ typings.std.Uint8ClampedArray, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(fd: scala.Double, buffer: typings.std.Uint8ClampedArray, offset: scala.Unit, length: scala.Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(
  fd: scala.Double,
  buffer: typings.std.Uint8ClampedArray,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
@scala.inline
def write(fd: scala.Double, data: js.Any): js.Promise[typings.fsExtra.anon.BufferString] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferString]]
@scala.inline
def write(
  fd: scala.Double,
  data: js.Any,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* str */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(fd: scala.Double, data: js.Any, offset: scala.Double): js.Promise[typings.fsExtra.anon.BufferString] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferString]]
@scala.inline
def write(
  fd: scala.Double,
  data: js.Any,
  offset: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* str */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(fd: scala.Double, data: js.Any, offset: scala.Double, encoding: java.lang.String): js.Promise[typings.fsExtra.anon.BufferString] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferString]]
@scala.inline
def write(
  fd: scala.Double,
  data: js.Any,
  offset: scala.Double,
  encoding: java.lang.String,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException, 
  /* written */ scala.Double, 
  /* str */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def write(fd: scala.Double, data: js.Any, offset: scala.Unit, encoding: java.lang.String): js.Promise[typings.fsExtra.anon.BufferString] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferString]]

@scala.inline
def writeFile(file: scala.Double, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeFile(
  file: scala.Double,
  data: js.Any,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFile(file: scala.Double, data: js.Any, options: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeFile(
  file: scala.Double,
  data: js.Any,
  options: java.lang.String,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFile(file: scala.Double, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeFile(
  file: scala.Double,
  data: js.Any,
  options: typings.fsExtra.mod.WriteFileOptions,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFile(file: typings.node.fsMod.PathLike, data: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeFile(
  file: typings.node.fsMod.PathLike,
  data: js.Any,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFile(file: typings.node.fsMod.PathLike, data: js.Any, options: java.lang.String): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeFile(
  file: typings.node.fsMod.PathLike,
  data: js.Any,
  options: java.lang.String,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFile(file: typings.node.fsMod.PathLike, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeFile(
  file: typings.node.fsMod.PathLike,
  data: js.Any,
  options: typings.fsExtra.mod.WriteFileOptions,
  callback: js.Function1[/* err */ typings.node.NodeJS.ErrnoException, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writeFileSync(path: scala.Double, data: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(path: scala.Double, data: java.lang.String, options: typings.node.fsMod.WriteFileOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(path: scala.Double, data: typings.node.NodeJS.ArrayBufferView): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(
  path: scala.Double,
  data: typings.node.NodeJS.ArrayBufferView,
  options: typings.node.fsMod.WriteFileOptions
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(path: typings.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(
  path: typings.node.fsMod.PathLike,
  data: java.lang.String,
  options: typings.node.fsMod.WriteFileOptions
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(path: typings.node.fsMod.PathLike, data: typings.node.NodeJS.ArrayBufferView): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeFileSync(
  path: typings.node.fsMod.PathLike,
  data: typings.node.NodeJS.ArrayBufferView,
  options: typings.node.fsMod.WriteFileOptions
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writeJSONSync_(file: java.lang.String, `object`: js.Any): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeJSONSync_(file: java.lang.String, `object`: js.Any, options: typings.fsExtra.mod.WriteOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writeJSON_(file: java.lang.String, `object`: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeJSON_(
  file: java.lang.String,
  `object`: js.Any,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeJSON_(file: java.lang.String, `object`: js.Any, options: typings.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeJSON_(
  file: java.lang.String,
  `object`: js.Any,
  options: typings.fsExtra.mod.WriteOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writeJson(file: java.lang.String, `object`: js.Any): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeJson(
  file: java.lang.String,
  `object`: js.Any,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeJson(file: java.lang.String, `object`: js.Any, options: typings.fsExtra.mod.WriteOptions): js.Promise[scala.Unit] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def writeJson(
  file: java.lang.String,
  `object`: js.Any,
  options: typings.fsExtra.mod.WriteOptions,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writeJsonSync(file: java.lang.String, `object`: js.Any): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writeJsonSync(file: java.lang.String, `object`: js.Any, options: typings.fsExtra.mod.WriteOptions): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writeSync(fd: scala.Double, buffer: typings.node.NodeJS.ArrayBufferView): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(fd: scala.Double, buffer: typings.node.NodeJS.ArrayBufferView, offset: scala.Double): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Double,
  length: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Double,
  length: scala.Double,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Double,
  length: scala.Null,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Double,
  length: scala.Unit,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Null,
  length: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Null,
  length: scala.Double,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Null,
  length: scala.Null,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Null,
  length: scala.Unit,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Unit,
  length: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Unit,
  length: scala.Double,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Unit,
  length: scala.Null,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  buffer: typings.node.NodeJS.ArrayBufferView,
  offset: scala.Unit,
  length: scala.Unit,
  position: scala.Double
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(fd: scala.Double, string: java.lang.String): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(fd: scala.Double, string: java.lang.String, position: scala.Double): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  string: java.lang.String,
  position: scala.Double,
  encoding: typings.node.BufferEncoding
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  string: java.lang.String,
  position: scala.Null,
  encoding: typings.node.BufferEncoding
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writeSync(
  fd: scala.Double,
  string: java.lang.String,
  position: scala.Unit,
  encoding: typings.node.BufferEncoding
): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def writev(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView]): js.Promise[typings.fsExtra.mod.WritevResult] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.mod.WritevResult]]
@scala.inline
def writev(
  fd: scala.Double,
  buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
  cb: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* bytesWritten */ scala.Double, 
  /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def writev(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView], position: scala.Double): js.Promise[typings.fsExtra.mod.WritevResult] = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.mod.WritevResult]]
@scala.inline
def writev(
  fd: scala.Double,
  buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
  position: scala.Double,
  cb: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* bytesWritten */ scala.Double, 
  /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
  scala.Unit
]
): scala.Unit = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def writevSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView]): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def writevSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView], position: scala.Double): scala.Double = (typings.fsExtra.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

type ArrayBufferView = typings.node.NodeJS.TypedArray | typings.std.DataView

type CopyFilterAsync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, js.Promise[scala.Boolean]]

type CopyFilterSync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Boolean]

type Mode = java.lang.String | scala.Double
