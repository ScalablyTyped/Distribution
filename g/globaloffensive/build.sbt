organization := "org.scalablytyped"
name := "globaloffensive"
version := "2.2-dt-20220411Z-a33500"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-742399",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-88eb4c",
  "org.scalablytyped" %%% "long" % "5.2.0-9c1ab6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "steam-user" % "4.23-dt-20220909Z-5a834d",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-69f8cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
