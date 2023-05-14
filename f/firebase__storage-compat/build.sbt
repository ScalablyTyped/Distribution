organization := "org.scalablytyped"
name := "firebase__storage-compat"
version := "0.3.2-5b1362"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.10-0aacb8",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.2.0-34a08c",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.2.1-1c5f49",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__storage" % "0.11.2-d12721",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.8.0-f0c524",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-0dca8e",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
