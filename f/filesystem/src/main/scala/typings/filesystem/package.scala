package typings.filesystem

import typings.filewriter.FileWriter
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Alias provided for backward compatibility */
type DirectoryEntry = FileSystemDirectoryEntry

/**
  * This interface is the callback used to look up DirectoryEntry objects.
  */
type DirectoryEntryCallback = js.Function1[/* entry */ FileSystemDirectoryEntry, Unit]

/**
  * When readEntries() succeeds, the following callback is made.
  */
type EntriesCallback = js.Function1[/* entries */ js.Array[FileSystemEntry], Unit]

/** Alias provided for backward compatibility */
type Entry = FileSystemEntry

/**
  * This interface is the callback used to look up Entry objects.
  */
type EntryCallback = js.Function1[/* entry */ FileSystemEntry, Unit]

/**
  * When an error occurs, the following callback is made.
  */
type ErrorCallback = js.Function1[/* err */ js.Error, Unit]

/**
  * This interface is the callback used to obtain a File.
  */
type FileCallback = js.Function1[/* file */ File, Unit]

/**
  * This interface is the callback used to look up FileEntry objects.
  */
type FileEntryCallback = js.Function1[/* entry */ FileEntry, Unit]

/**
  * When requestFileSystem() succeeds, the following callback is made.
  */
type FileSystemCallback = js.Function1[/* filesystem */ FileSystem, Unit]

/**
  * This interface is the callback used to create a FileWriter.
  */
type FileWriterCallback = js.Function1[/* fileWriter */ FileWriter, Unit]

/**
  * This interface is the callback used to look up file and directory metadata.
  */
type MetadataCallback = js.Function1[/* metadata */ Metadata, Unit]

/**
  * This interface is the generic callback used to indicate success of an asynchronous method.
  */
type VoidCallback = js.Function0[Unit]
